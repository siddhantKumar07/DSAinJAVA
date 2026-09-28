public class printAlternate {
 public static void main(String[] args) {
int arr []={1,2,3,4,5,6,7,8,9};
int i =0,j=arr.length-1;
while(i<=j){
    if(i==j) 
        {System.out.println(arr[i]);
                return;
        }
    else {
        System.out.println(arr[i]);
        System.out.println(arr[j]);

    }
    i++;
    j--;
}
}   
}
