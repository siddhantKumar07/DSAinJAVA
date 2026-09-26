package string;

public class countLength {
    public static void main(String[] args) {
        String name = "Siddhant";
        int count =0;
     for (char alphabet : name.toCharArray()) {
          count++;
     }
     System.out.printf("there are %d element in name ",count);
    }
}
