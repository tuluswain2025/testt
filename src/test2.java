import java.util.ArrayList;
import java.util.Collections;

public class test2 {
    public static void main(String s[])
    {
      ArrayList list=new ArrayList();
      list.add(12);
        list.add(1);
        list.add(15);
        list.add(18);
        list.add(22);
        list.add(23);
        System.out.println("before sort...."+list);
        Collections.sort(list);
        System.out.println("after sort...."+list);
    }
}
