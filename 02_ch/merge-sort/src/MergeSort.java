import java.util.Arrays;
/**
 * Created by ghufran on 11/25/15.
 */
public class MergeSort {


    int inversion_sum = 0;
    
    public int inversions()
    {
        return inversion_sum;
    }
    
    public int[] sort(int[] ary)
    {
        int p,q,r;
        p = 0;
        r = ary.length - 1;
        int[] sort_result_ary; 
        
        if (p < r)
        {
            q = (p + r)/2;
            sort_result_ary = merge( 
            sort(Arrays.copyOfRange(ary,p,q+1)),
            sort(Arrays.copyOfRange(ary,q+1,r+1))
            );
            
        }
        else
        {
            sort_result_ary = ary;
        }
        return sort_result_ary;
        
    }
    
    public int[] merge(int[] ary1, int[] ary2)
    {
        int ary_length = ary1.length + ary2.length;
        int[] merge_result_ary = new int[ary_length];
        int ptr1 = 0; 
        int ptr2 = 0;

        int local_inversions = 0;
        
        for (int i = 0; i < ary_length ; i++)
        {
            if (ptr1 >= ary1.length && ptr2 >= ary2.length)
            {
                return merge_result_ary;
            }
            else if (ptr1 >= ary1.length)
            {
                merge_result_ary[i] = ary2[ptr2++];
            }
            else if (ptr2 >= ary2.length)
            {
                merge_result_ary[i] = ary1[ptr1++];
                inversion_sum += local_inversions;
            }
            else if (ary1[ptr1] <= ary2[ptr2])
            {
                merge_result_ary[i] = ary1[ptr1++];
                inversion_sum += local_inversions;
            }
            else
            {
                merge_result_ary[i] = ary2[ptr2++];
                local_inversions += 1;
            }
        }
        return merge_result_ary;
        
    }
}
