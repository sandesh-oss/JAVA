import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Values of arr :");
        int s = 0;
        for(int j=0; j<arr.length; j++){
            //s = s+arr[j];
            System.out.println(arr[j]);
            if(arr[j]>s){
                s = arr[j];
            }
        }
        System.out.println("sum is :");
        System.out.println(s);
    }
}
