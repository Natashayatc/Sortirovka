package Sort;

public class Quick_sort {
	public static void Quick_sort(int[] nums, int low, int high) {
		int i = low;
		int j = high;
		int x = nums[(low+high)/2];
		do {
		while(nums[i] < x) ++i;
		while(nums[j] > x) --j;
		if(i <= j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		i++; j--;
		}
		} while(i < j);
		if(low < j) Quick_sort(nums, low, j);
		if(i < high) Quick_sort(nums, i, high);

		}
public static void main(String[] args){
	
}
}