public class reverseString {

    public static void main(String[] args) {

        String str1 = "selenium";
        String str2="";
        
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }
        System.out.println("original String...."+str1);
        System.out.println("Reversed string....."+str2);

    }
}
