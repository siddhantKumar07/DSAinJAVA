public class revision {
    
    static int secondLargest(int arr[]){
        int largest =Integer.MIN_VALUE;
        int secondLar= Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
        if(arr[i]>largest){
            secondLar=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondLar){
            secondLar=arr[i];
        }
      }
      return secondLar;
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,7,2,6,5,28,49,44,722,1,4};
        System.out.println(secondLargest(arr));
    }
}
