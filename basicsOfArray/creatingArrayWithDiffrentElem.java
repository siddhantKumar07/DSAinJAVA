import java.util.Arrays;
import java.util.Scanner;

public class creatingArrayWithDiffrentElem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many rows you want into array ?");
        int row = sc.nextInt();
        int arr[][]= new int[row][];
        for (int i = 0; i < row; i++) {
            // how many columns 
            System.out.println("how many columns you want?");
            int column = sc.nextInt();
            arr[i] = new int[column];
            System.out.println("enter "+column+" elements");
            for (int j = 0; j <column; j++) {
              arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("your array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}