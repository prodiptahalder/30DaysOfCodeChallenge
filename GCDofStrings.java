public class GCDofStrings {
        public static void main(String[] args){
            System.out.println(gcdOfStrings("ABABAB","ABAB"));
        }
        public static String gcdOfStrings(String str1, String str2) {
            if(str1.length()>str2.length()){
                String temp="";
                temp=str1;
                str1=str2;
                str2=temp;
            }
            for(int k=str1.length();k>=1;k--){
                if(str1.length()%k!=0)
                    continue;
                if(str2.length()%k!=0)
                    continue;
                String s=str1.substring(0,k);
                int flag=1;
                for(int i=0;i<str1.length();i+=k){
                    if(!str1.substring(i,i+k).equals(s)){
                        flag=0;
                        break;
                    }
                }
                for(int i=0;i<str2.length();i+=k){
                    if(!str2.substring(i,i+k).equals(s)){
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                    return s;
            }
            return "";
        }
}
