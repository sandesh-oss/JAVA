public class palindrome {
    public static void main(String[] args){
        String str = "car";
        String str1 = "";
        for(int i = str.length()-1;i>=0; i-- ){
            str1 += str.charAt(i);
        }
        if(str1.equals(str)){
            System.out.println("palindrome");
        }
        else System.out.println("not palindrpme");
    }
}
