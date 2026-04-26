public class Vowels {
    public static void main(String[] args) {

       String s1="";
      // StringBuilder sb=new StringBuilder();
        String s2="";

       for(int i=s1.length()-1;i>=0;i--)
       {
           char[] ch=s1.toCharArray();
          // System.out.println(ch[5]);
          //sb.append(ch[i]);--------------------------------------------------------------
           s2+=ch[i];
   System.out.println("test.....");
       }
       System.out.println(s2);
    }
}
