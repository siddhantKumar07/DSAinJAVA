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
    

    }
}
