package pattern;

public class pyramidChar {
    public static void main(String[] args) {
        int n =4;
        char ch ='A';
        for (int i = 1; i <=n; i++) {
            // for space 
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            // part 2
            for (int j = 1; j <=i; j++) {
                System.out.print(ch);
                ch++;
            }
            ch--;
            // part 3
            for (int j = 1; j <=i-1; j++) {
                ch--;
                System.out.print(ch);
            }
            ch='A';
            System.out.println();
        }
    }
}
