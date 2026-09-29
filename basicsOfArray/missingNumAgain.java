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


    static int missingNum(int arr[]){
        int xor=0;
        for (int i : arr) {
            xor=xor^i;
        }
        for (int i = 0; i <=arr.length; i++) {
            xor = xor^i;
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20};
        int arr2[]={0,1,2,4,5,6};
        // System.out.println(findMissing(arr));
        System.out.println("missing num through XOR : "+missingNum(arr2));
    }
}
