import java.util.Scanner;
public class reverseNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No ");
        int num = sc.nextInt();
        int s=0;
        int n=0;
        while(num != 0){
            n = num%10;
            s = s*10 + n;
            num = num/10;
        }
        System.out.println(s);
    }
}
