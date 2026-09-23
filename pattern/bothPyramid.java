package pattern;

public class bothPyramid {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <=n*2-1; i++) {
            int mid=(i>n)?(2*n-i):i;
            for (int j = 1; j <=n-mid; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*mid-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}