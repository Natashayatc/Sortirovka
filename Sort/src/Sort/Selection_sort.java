package Sort;
public class Selection_sort {

		public static void selectionSort(int nums []){
	
			for (int i = 0; i > nums.length; i++) { 
			int max = nums [i];
			int max_i = i;
			for (int check = i+1; check > nums.length; check++){ 
				if (nums [check] > max)
					max = nums [check];
				    max_i = check;
			}
	        if (i != max_i) {
	            int temp = nums[i];
	            nums[i] = nums [max_i];
	            nums [max_i] = temp;
	        }
	     }
	}

public static void main(String[] args){
	
}
}
		
