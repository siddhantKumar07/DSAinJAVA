package collectionFramework;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Iterators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<>();
        System.out.println("enter names");
        
        // for (int i = 0; i < 3; i++) {
        //     list.add(sc.nextLine());
        // }
        // System.out.println(list);// this will print the whole list 

        list.add("siddhant");
        list.add("aakash");
        list.add("aryan");
        // Iterator <String> it = list.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // for (String string : list) {
        //          System.out.println(string);
        // }

        // using contains method to check whether a element present in the list or not 
        System.out.println(list.contains("siddhant"));

        List <Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(7);
        list2.add(6);
        list2.add(5);
     System.out.println("list2 "+list2);
    Collections.sort(list2);
    System.out.println(list2);

    ArrayList <Integer> cloned = (ArrayList<Integer>)list.clone();// clone method is used to create a copy of the list
     System.out.println("cloned "+cloned);
    }
}
