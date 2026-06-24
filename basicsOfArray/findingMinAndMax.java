public class findingMinAndMax {
static void findMinAndMax(int arr[]){
    int min=arr[0];
    int max=arr[0];
     for (int i = 0; i < arr.length; i++) {
        if(arr[i]<min){
            min=arr[i];
        }
        if(arr[i]>max){
            max=arr[i];
        }
     }

     System.out.println("minimum value is :"+min);
     System.out.println("maximum value is :"+max);
}
public static void main(String[] args) {
    int arr[]={1,2,4,5,-78,5,32,3,-7,-8,5,1,2};
    findMinAndMax(arr);
}
}
