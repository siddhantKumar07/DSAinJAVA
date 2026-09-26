package string;

public class reverse {
    public static void main(String[] args) {
        String name ="siddhant";
        String reverse="";
        for (int i = name.length()-1; i >=0; i--) {
            reverse+=name.charAt(i);
        }
        System.out.println(reverse);
        StringBuilder names = new StringBuilder(name);
        System.out.println(names.reverse() );
        
    }
}
