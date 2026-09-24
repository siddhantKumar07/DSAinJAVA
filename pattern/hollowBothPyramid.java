package pattern;

public class hollowBothPyramid {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <=n*2-1; i++) {
            int mid =(i>n)?2*n-i:i;
            // for space
            for (int j = 1; j <=n-mid; j++) {
                System.out.print(" ");
            }
            // for star
            for (int j = 1; j <=2*mid-1; j++) {
                if(j==1||j==2*mid-1) System.out.print("*");
                else  System.out.print(" ");
            }

            // for next line 
            System.out.println();
        }
    }
}
