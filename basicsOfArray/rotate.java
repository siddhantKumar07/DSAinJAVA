public class rotate{
    static int[] reverse(int arr[]){
        int i=0,j=arr.length-1;

        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int temp[]= new int[3];
        int rest[]=new int[6];
        for (int i = 0; i < arr.length; i++) {
           if(i<3){
             temp[i]=arr[i];
           }
           else{
            rest[i]=arr[i];
           }
        }
        for (int i = 0; i < rest.length; i++) {
            
        }
    }
}