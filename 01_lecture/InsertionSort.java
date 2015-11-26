import java.util.Arrays;


public class InsertionSort
{
    public static void main(String[] args)
    {

        int[] unsorted = new int[3];
        unsorted[0] = 3;
        unsorted[1] = 2;
        unsorted[2] = 1;


        int[] sorted = sort(unsorted);
        System.out.println(Arrays.toString(sorted));

    }

    public static int[] sort(int[] ary)
    {
        for (int i=1 ; i < ary.length ; i++ )
        {
            int key = ary[i];
            int j = i - 1;
            while (j >= 0 && ary[j] > key)
            {
                ary[j+1] = ary[j];
                j--;
            }

            ary[j+1] = key;

        }

        return ary;
    }
}
