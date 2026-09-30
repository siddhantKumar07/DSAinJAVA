public class threeSum {
    
static int[] threeSum(int []arr , int target){
    for (int i = 0; i < arr.length-2; i++) {
        for (int j = i+1; j < arr.length-1; j++) {
            for (int j2 = j+1; j2 < arr.length; j2++) {
                if(arr[i]+arr[j]+arr[j2]==target){
                    int ans[]={i,j,j2};
                    return ans; 
                }
            }
        }
    }
    return new int[]{-1,-1,-1};
}
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    int target =10;
    int ans []= threeSum(arr, target);
    System.out.println("the index of arr which's sum is equal to target "+ans[0]+" , "+ans[1]+" , "+ans[2]);
}
}
