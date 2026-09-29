public class findUniqueElem {
    public static void main(String[] args) {
        // find the elem which do not occur 2 times 
        int arr[]={1,2,2,4,5,6,5,6,1,3,4};
        int unique=0;
        for (int i : arr) {
            unique=unique^i; // xor operation
        }
        System.out.println(unique);
    }
}
