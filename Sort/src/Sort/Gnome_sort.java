package Sort;
import java.util.Arrays; 
public class Gnome_sort {
	 static void gnomeSort(int arr[], int n) 
	    { 
	        int index = 0; 
	  
	        while (index < n) { 
	            if (index == 0) 
	                index++; 
	            if (arr[index] >= arr[index - 1]) 
	                index++; 
	            else { 
	                int temp = 0; 
	                temp = arr[index]; 
	                arr[index] = arr[index - 1]; 
	                arr[index - 1] = temp; 
	                index--; 
	            } 
	        } 
	        return; 
	    } 
public static void main(String[] args) 
{ 
    int arr[] = { 23, 11, -8, 7, -3, 3 }; 

    gnomeSort(arr, arr.length); 

    System.out.print("Гномья сортировка: "); 
    System.out.println(Arrays.toString(arr)); 
} 
} 

		