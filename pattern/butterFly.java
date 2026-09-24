package pattern;

public class butterFly {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <=2*n; i++) {
            // for star
            int mid =(i>4)?2*n-i+1:i;
            for (int j = 1; j <=mid; j++) {
                System.out.print("*");
            }
            // for space
            for (int j = 1; j <=2*(n-mid); j++) {
                System.out.print(" ");
                
            }
            // for star
              for (int j = 1; j <=mid; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
