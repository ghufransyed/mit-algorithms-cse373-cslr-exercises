import java.util.Arrays;
/**
 * Created by ghufran on 12/10/15.
 */
public class MergeSortRunner {
    public static void main(String[] args)
    {
        int[] test_array = new int[5];
        test_array[0] = 2;
        test_array[1] = 3;
        test_array[2] = 8;
        test_array[3] = 6;
        test_array[4] = 1;
        //test_array[5] = 3;
        //test_array[6] = 2;
        //test_array[7] = 1;
        
        MergeSort ms = new MergeSort();


        System.out.println(Arrays.toString(test_array));
        System.out.println(Arrays.toString(ms.sort(test_array)));
        System.out.println("The number of inversions was:" + ms.inversions());
    }
}
