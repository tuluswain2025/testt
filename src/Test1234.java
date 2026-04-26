import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test1234 {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter a number...");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        int s2 = Integer.parseInt(s1);
        int count2 = 0;
        int count3 = 0;
        for (int i = 1; i <=s2; i++) {
            if (i % 2 == 0) {
               
                count2++;
            }
            else
            {
                count3++;
            }


        }
        System.out.println("no of even no from 1 to "+s2+" is " + count2);
        System.out.println("no of odd no from 1 to "+s2+" is " + count3);
    }
}
