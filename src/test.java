interface test1 {

    default void test() {
        System.out.println("test");
    }
    static void test1() {
        System.out.println("test1");
    }
    private static void test2() {
        System.out.println("test2");
    }
}

public class test implements test1{
    public static void main(String[] args) {
        test test = new test();
        test.test();


    }

        }
