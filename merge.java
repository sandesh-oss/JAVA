import java.util.Scanner;
public class merge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        int[] arr1 = new int[n];
        int[] mrg = new int[arr.length + arr1.length];
        for(int k =0; k<n; k++){
            arr[k] = sc.nextInt();
        }
        for(int l =0; l<n; l++){
            arr1[l] = sc.nextInt();
        }
        for(int m=0; m<arr.length; m++){
            mrg[m] = arr[m];
        }
        for(int p=0; p<arr1.length; p++){
            mrg[arr.length + p] = arr1[p];
        }
        System.out.println();
        for(int j=0; j<arr.length + arr1.length; j++){
            System.out.println(mrg[j]);
        }
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i] == arr1[j])  count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
