import java.util.Scanner;

public class FindMaxElem {
    
    // method to find the max elem in array 
    static int maxelem(int arr[]){
        int max=0;
       for (int i = 0; i < arr.length; i++) {
        if(max<arr[i]){
            max=arr[i];
        }
       }
       return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements in array");
        int arr[]= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
      System.out.println("largest elem : "+maxelem(arr));
    }
}
