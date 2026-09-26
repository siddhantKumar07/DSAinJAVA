package string;

public class methods {
    public static void main(String[] args) {
        String name ="siddhant";
        String anotherName="siddhant";

        // == comparison through == ; it compares that -is it refering to the same object in string pool or not ;
        // it doesnot compare the value
        System.out.println(name==anotherName);

        // if we create a string with new keyword , so the string is not created in string pool in heap 
        // == return false because both are not refering to the same element 
        String name2 = new String("siddhant");
        System.out.println(name==name2);// false 

        System.out.println(name.equals(name2));// true because it compares the value not reference 
    System.out.println(name.equalsIgnoreCase(name2));// true because it compares the value not reference and ignore the case of string

System.out.println(name.contains("t"));// true because it checks if the string contains the given character or not
System.out.println(name.charAt(3));// d because it returns the character at the given index
System.out.println(name.indexOf("d"));// 3 because it returns the index of the given character
System.out.println(name.length());// 8 because it returns the length of the string
System.out.println(name.substring(2,5));//  because it returns the substring from index 2 to 5
System.out.println(name.replace("s","S"));// Siddhant because it replaces the given
    }
}
