import java.util.Scanner;
public class fiveEleven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no ");
        int n = sc.nextInt();
        if(n%5 == 0 && n%11 == 0){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }
    }
}
