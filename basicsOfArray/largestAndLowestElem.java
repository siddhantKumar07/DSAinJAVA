public class largestAndLowestElem {

    static void largOrSma(int arr[]){
        int small=arr[0];
        int large=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>large){
               large=arr[i];
            }
            else if(arr[i]<small){
            small=arr[i];
            }
        }

        System.out.println("smallest = "+small);
        System.out.println("largest = "+large);
    }



public static void main(String[] args) {
    int arr[]={1,5,4,8,-77,-4,2,5,6,8};
    largOrSma(arr);
    
}

    
}

