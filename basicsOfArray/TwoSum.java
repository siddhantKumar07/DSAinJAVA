public class TwoSum {
static void retrnsum(int arr[],int target){
for (int i = 0; i < arr.length; i++) {
    for (int j = i+1; j < arr.length; j++) {
        if(arr[i]+arr[j]==target){
            System.out.printf("%d + %d = target value \n",arr[i],arr[j]);
        }
    }
}
}
public static void main(String[] args) {
    int target =7;
    int arr[]={1,2,3,4,5,6};
    retrnsum(arr, target);
}
}
