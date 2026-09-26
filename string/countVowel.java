package string;

import java.util.Scanner;
public class countVowel {
    public static void main(String[] args) {
        System.out.println("enter sentence ");
        Scanner sc =  new Scanner(System.in);
        String sentence =sc.nextLine();
        sentence=sentence.toLowerCase();
        int count=0;
        for (int i = 0; i < sentence.length(); i++) {
            if("aeiou".contains(sentence.charAt(i)+"")){
                count++;
                }
        }
        System.out.println("Number of vowels in the sentence: " + count);
    }
}
