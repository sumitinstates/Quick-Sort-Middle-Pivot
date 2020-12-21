package com.sumit;

public class QuickSort {

	public void quickSort(int[]array, int start, int end) 
	{
		//if this is not here, it will give stackoverflow error
		if(start>=end) 
		{
			return;
		}
		
		int pivot = array[(start + end)/2];
		
		int index = partition(array,start, end, pivot);
		
		quickSort(array, start, index - 1);
		quickSort(array, index, end);
		
	}
		
	private int partition(int[] array, int start, int end, int pivot) 
    {
		
			while(start<end) 
			{
				while(array[start]<pivot) 
				{
					start++;
				}
				
				while(array[end]>pivot) 
				{
					end--;
				}
				
				if(start<=end) 
				{
					int temp = array[start];
					array[start]=array[end];
					array[end]= temp;
					start++;
					end--;
				}
			}
			return start ; 
	}
}
		
