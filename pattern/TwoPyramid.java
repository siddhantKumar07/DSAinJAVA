package pattern;

public class TwoPyramid {
    public static void main(String[] args) {
        int n =4;
        for (int i = 1; i <=2*n-1; i++) {
                int mid = (i>n)?(2*n-i):i;
            // for space
            for (int j = 1; j <=mid-1; j++) {
                System.out.print(" ");
            }

            // for star 
            for (int j = 1; j <=2*n-mid-(mid-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
