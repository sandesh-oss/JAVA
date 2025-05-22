
public class Except {
    public static void main(String[] args) {
        // int a=10; int b = 0;
        // try {
        //        int c = a/b;
        //        System.out.println(c);
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("we can not divide by zero");
        // }
        // System.out.println("hello");
        // System.out.println("hiiii");

        // int[] arr = {1,2,3,4};
        // try {
        //     System.out.println(arr[6]);
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // }
        // System.out.println("hiii");


        String str = null;
        try {
            System.out.println(str.toUpperCase());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("null pointer exception");
        }
        System.out.println("hiii");
    }
}
