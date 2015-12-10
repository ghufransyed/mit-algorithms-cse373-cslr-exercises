import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] testArray = new int[5];
        int testVal = 3;
        
        for (int i = 0; i < testArray.length; i++)
        {
            testArray[i] = i;
        }
        
        System.out.println(Arrays.toString(testArray));
        System.out.println("Searching for: " + testVal); 
        System.out.println(binarySearch(testArray, testVal));
        
    }
    
    public static int binarySearch(int[] A, int v)
    {
        int high = A.length - 1;
        int low = 0;
        int mid;
        
        while (low < high)
        {
            mid = (low + high)/2;
            
            
            if (A[mid] == v)
            {
                return mid;
            }
            if (A[mid] > v)
            {
                high = mid - 1;
            }
            if (A[mid] < v)
            {
                low = mid + 1;
            }
        }
        if (A[low] == v)
        {return low;}
        return -1; // used as return value due to typing
    }
}
