public class SecondMaximum {
    static void Secondmax(int arr[]){
        int mx=arr[0];
        int secondMax=0;
     for (int i = 0; i < arr.length; i++) {
         if(arr[i]>mx){
            mx=arr[i];
         }
     }
     for (int i = 0; i < arr.length; i++) {
        if(arr[i]>secondMax&&arr[i]!=mx){
            secondMax=arr[i];
        }
     }
     System.out.println("second max :"+secondMax);
    }
    public static void main(String[] args) {
        int arr[]={1,5,8,844,5,62,72,46,6};
        Secondmax(arr);
    }
}
