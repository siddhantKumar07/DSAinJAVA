public class findDublicate{

  static  void dublic(int arr[]){
        for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
            if(arr[i]==arr[j]){
                System.out.println("dublicate element found : "+arr[i]);
            }
           }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,5,4,9,6,7,1,2};
        dublic(arr);
    }
}