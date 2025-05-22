public class bubblesort {
    static int[] sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length -i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        return arr;
    }
   public static void main(String[] args){
    int[] arr ={ 2,5,10,3,22,4};
    int[] a = sort(arr);
    int target = 3;
    for(int i=0; i<a.length; i++){
        if(a[i] == target){
            System.out.println(i);
        }
    }
   } 
}
