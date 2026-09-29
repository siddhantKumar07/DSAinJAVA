public class missingNumAgain {

    static int totalCount(int [] arr){
        int total=0;
        for (int i : arr) {
            total+=i;
        }
        return total;
    }
    static int findMissing (int [] arr){
        int n =arr.length+1;
     int expectedTotal=(n*(n-1))/2;
    return totalCount(arr)-expectedTotal;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20};
        System.out.println(findMissing(arr));
    }
}
