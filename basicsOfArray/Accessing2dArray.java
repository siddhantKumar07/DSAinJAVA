public class Accessing2dArray {
public static void main(String[] args) {
    int arr[][]={
        {1,2,2,3,4},
        {33,4},
        {7,5,6,3,2,8,5,6},
        {5}
    };
   for (int i = 0; i < arr.length; i++) {
    // for column 
    int column = arr[i].length;
    for (int j = 0; j < column; j++) {
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
   }
}    
}
