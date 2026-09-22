package pattern;

import java.util.Scanner;
/**
 *    1
 *    0 1
 *    1 0 1
 *    0 1 0 1
 *    1 0 1 0 1 
 */
public class binaryPattern {
    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int start;
        for (int i = 1; i <=n; i++) {
            start = (i%2==0)?0:1;
            for (int j = 1; j <=i; j++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
}
