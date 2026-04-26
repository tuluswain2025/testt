import java.util.HashSet;

public class duplicateArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5,4,5,1,2,4,7};
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> set1=new HashSet<Integer>();

        for (int i : a) {
            if(!set.add(i)){
                set1.add(i);

            }

        }
        System.out.println(""+set1);
    }
}
