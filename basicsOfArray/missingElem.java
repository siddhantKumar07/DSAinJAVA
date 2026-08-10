public class missingElem {
    static int missing(int arr[]) {
        // Assuming the array is missing 1 element from the range 1 to (n + 1)
        int n = arr.length + 1; 
        
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = (n * (n + 1)) / 2;
        
        // Calculate the actual sum of elements present in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
     
        // The difference is the missing element
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Example: Range is 1 to 5, missing 3
        int arr[] = {1, 2, 4, 5}; 
        System.out.println("The missing element is: " + missing(arr));
    }
}