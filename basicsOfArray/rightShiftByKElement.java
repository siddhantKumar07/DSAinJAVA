public class rightShiftByKElement {
   int[] shiftByk(int[] arr,int k){
    int n = arr.length-1;
    int i=n;
   int temp[]= new int[k];
   int tempk=k;
   for (int j = 0; j < temp.length; j++) {
    if(tempk>=0){
        temp[j]=arr[n-tempk];
    tempk++;
    }
   }
   while(i>=0){
  if(i==k){
    arr[i]=temp[i];
    k--;
  }
  else{
    arr[i]=arr[i-1];
  }
   }


    return arr;
   }  


   public static void main(String[] args) {
    
   }
   
}
