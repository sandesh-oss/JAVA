public class builder{
    public static void main(String[] args){
        //String str = "hello";
        StringBuilder str = new StringBuilder(4); // to make string mutable
        str.append("hii this is me");   // this is only for string builder
        System.out.println(str);
        System.out.println(str.capacity());
    }
}