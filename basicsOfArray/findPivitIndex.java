import java.util.Arrays;

public class findPivitIndex {
    public static void main(String[] args) {
        int arr1[]={5,6,3,2,7,7};
        int sum=0;
        for (int i = 0; i < arr1.length; i++) {
            sum+=arr1[i];
        }
        int leftsum=0;
        for (int i = 0; i < arr1.length; i++) {
            if(leftsum==sum-arr1[i]){
                System.out.println("pivit index is: "+i);
                break;
            }
            leftsum+=arr1[i];
            sum-=arr1[i];
        }

        // second 
        //  int arr[]={5,6,3,2,7,7};
        // int n = arr.length;
        //     int leftSum[] = new int[n];
        //     int rightSum[] = new int[n];

        //     leftSum[0]=arr[0];
        //     for (int i = 1; i < rightSum.length; i++) {
        //         leftSum[i]=leftSum[i-1]+arr[i];
        //     }

        //     rightSum[n-1]=arr[n-1];
        //     for (int i = n-2; i >=0; i--) {
        //       rightSum[i]=rightSum[i+1]+arr[i];
        //     }
        //     System.out.println(Arrays.toString(leftSum));
        //     System.out.println(Arrays.toString(rightSum));

        //     for (int i = 0; i < n; i++) {   

            //     if(leftSum[i]==rightSum[i]){
            //         System.out.println("the pivot is : "+i);
            //     }
            // }
    }
}
