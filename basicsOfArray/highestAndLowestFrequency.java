import java.util.HashMap;

public class highestAndLowestFrequency {
    public static void main(String[] args) {
        int arr[]={1,1,1,3,9,7,2,3,4,5,5,4,5,4,7,5,4,5,9,6,5,2};
        HashMap <Integer,Integer> freq = new HashMap<>();
         int highestCount=Integer.MIN_VALUE;
         int lowestCount=Integer.MAX_VALUE;
         int highestFrequency=0;
         int lowestFrequency=0;
        for (int elem : arr) {
            freq.put(elem,freq.getOrDefault(elem,0)+1);
        }


        for (int elem : freq.keySet()) {
            if(freq.get(elem)>highestCount){
                highestCount=freq.get(elem);
                highestFrequency=elem;
            }
            if(freq.get(elem)<lowestCount){
                lowestCount=freq.get(elem);
                lowestFrequency=elem;
            }
            System.out.println(elem+" --> "+freq.get(elem));
        }
        System.out.println("highest frequency = "+highestFrequency);
        System.out.println("lowest frequency = "+lowestFrequency);
    }
}
