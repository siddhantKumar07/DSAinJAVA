import java.util.Arrays;
import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float avg;
        float sum=0;
    int arr[]=new int[5];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }
     for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
     }
     avg=sum/arr.length;
     System.out.println("the average is : "+avg);
    }
}
