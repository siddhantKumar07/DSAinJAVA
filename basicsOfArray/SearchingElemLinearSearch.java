import java.util.Scanner;

public class SearchingElemLinearSearch {

    // method which returns the index of the array 
    int findTarget(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SearchingElemLinearSearch obj = new SearchingElemLinearSearch();
        int arr[]= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int founOrNot=obj.findTarget(arr,44);
        if(founOrNot==-1){
            System.out.println("target is not found inside the array");
        }
        else{
        System.out.println("the index is found at "+founOrNot);

        }
        
    }


}
