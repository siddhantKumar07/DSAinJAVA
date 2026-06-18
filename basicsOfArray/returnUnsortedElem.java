public class returnUnsortedElem {
    
    static int unsortedFind(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]<=arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,8};
        System.out.println(unsortedFind(arr));
    }
}
