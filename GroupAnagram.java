
import java.io.*;
import java.util.*;

class GroupAnagram {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution ob = new  Solution();
	        
	        List <List<String>> ans = ob.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}
class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        HashMap<HashMap<Character, Integer>, List<String>> bmap=new HashMap<>();
        for(String str: string_list){
            HashMap<Character, Integer> smap = new HashMap<>();
            for(int i=0; i<str.length(); i++){
                Character ch=str.charAt(i);
                smap.put(ch, smap.getOrDefault(ch, 0)+1);
            }
            if(bmap.containsKey(smap)==false){
                List<String> list=new ArrayList<String>();
                list.add(str);
                bmap.put(smap, list);
            }else{
                List<String> list=bmap.get(smap);
                list.add(str);
                bmap.put(smap, list);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(List<String> val: bmap.values()){
            res.add(val);
        }
        return res;
    }
}
