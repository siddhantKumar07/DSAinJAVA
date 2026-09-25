package pattern;

public class numberPyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=n; i++) {
            // for spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            // for number
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            // for last number
            for (int j = i-1; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
