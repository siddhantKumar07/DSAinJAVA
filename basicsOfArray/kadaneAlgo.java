public class kadaneAlgo {
    // kadane's algorithm , it return the largest sum of a subarray can make 
    static int kadane(int []arr){
        int sum=0,maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
              // sum 
              sum+=arr[i];

              //condition to check whether the sum is greater than max 
              maxi=sum>maxi?sum:maxi;

              // condition for negative 
              sum=sum<0?0:sum;
        }


        return maxi;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("max sum of subarray = "+kadane(arr));
    }
}
