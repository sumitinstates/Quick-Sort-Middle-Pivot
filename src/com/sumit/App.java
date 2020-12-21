package com.sumit;

import java.util.Arrays;

public class App {
	
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int [] array = {9,2,6,3,5,4,1};
		
		qs.quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
			
	}

}
