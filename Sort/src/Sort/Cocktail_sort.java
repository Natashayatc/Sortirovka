package Sort;

public class Cocktail_sort {
	public static void main(String[] args)
    {
        int[] array = {1, 5, 6, 2, 7, 4, 10, 12, 3};
        int left = 0;
        int right = array.length - 1; 
  
        do
        {
            for (int i = left; i < right; i++)
            {
                if(array[i] > array[i+1])
                {
                    array[i] ^= array[i+1];
                    array[i+1] ^= array[i];
                    array[i] ^= array[i+1];
                }
            }
            right--; //
            for (int i = right; i > left ; i--)
            {
                if(array[i] < array[i-1])
                {
                    array[i] ^= array[i-1];
                    array[i-1] ^= array[i];
                    array[i] ^= array[i-1];
                }
            }
            left++; 
        } while (left <= right);
  
        for (int i : array) System.out.print(i + " ");
    }
}

