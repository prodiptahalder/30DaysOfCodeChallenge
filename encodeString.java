// { Driver Code Starts
    import java.util.*;
 
    class encodeString
    {
       public static void main(String[] args) 
       {
     
          Scanner sc = new Scanner(System.in);
        
          int T = sc.nextInt();
          sc.nextLine();
          while(T>0)
          {
              
            String str = sc.nextLine();
            
            GfG g = new GfG();
            System.out.println(g.encode(str));
            
          
            T--;
          }
       }
    }
    
    // } Driver Code Ends
    
    
    class GfG
     {
        String encode(String src)
        {
            char[] ch = src.toCharArray();
            int cnt = 1;
            StringBuilder sb = new StringBuilder("");
            sb.append(ch[0]);
            for(int i = 1; i< ch.length;i++){
                if (ch[i] == ch[i-1]){
                    cnt++;
                }else{
                    sb.append(cnt);
                    cnt = 1;
                    sb.append(ch[i]);
                }
            }
            sb.append(cnt);
            return sb.toString();
            // Map<Character, Integer> encStr= new HashMap<>();
            // for(int i=0;i<src.length();i++){
            //     char ch=src.charAt(i);
            //     encStr.put(ch, encStr.getOrDefault(ch, 0)+1);
            // }
            // String str="";
            // for (Map.Entry<Character,Integer> entry : encStr.entrySet())
            //         str=str+entry.getKey()+entry.getValue();
            // return str;
        }
        
     }