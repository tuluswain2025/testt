import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws Exception {
        String s="ram-2#sam-89#dam-35#kam-123";
        ArrayList list1=new ArrayList();
        String[] s1 =s.split("#");
     //
        // Arrays.sort(s1,3,4);
        for(String s3:s1)
        {
  // System.out.println(s3);
            String[] sub=s3.split("-");
           // Arrays.sort(sub);
            for(String s4:sub) {
              //  System.out.println(s4);
                if (s4.matches(".*\\d.*")){
                    //list1=new ArrayList();
                    list1.add(s4);


                }
                else{
                    ArrayList list2=new ArrayList();
                    list2.add(s4);
                    Collections.sort(list2);
                   // System.out.println(list2);
                }

            }

        }
        Collections.sort(list1);
        Collections.sort(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}