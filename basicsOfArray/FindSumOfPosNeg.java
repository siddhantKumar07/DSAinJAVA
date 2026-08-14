public class FindSumOfPosNeg {

    static void sum(int arr[]) {
     int sum=0;
     for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
        
     }
     System.out.println("the sum :"+sum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,-4,5,-1,2,-8};
        sum(arr);
    }
}
