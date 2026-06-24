public class linearSearch {
    
    static void search(int []arr,int target){
        int index= -1;
       for (int i = 0; i < arr.length; i++) {
             if(arr[i]==target) {
               index=i;
               break;
             }
       }
        if(index!=-1) System.out.println("element is found at index :"+index);
        else System.out.println("Not found");
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target =77;
    search(arr, target);
    }
}
