package ThursdayLab;

import java.util.Scanner;

class MinMaxInArray{
	
	 //method to get maximum number from array elements
    int getMax(int[] inputArray)
    {
    	int maxValue = inputArray[0];
    
    	for (int i=1;i<inputArray.length;i++)
    	{
    		if(inputArray[i]> maxValue)
    		{
    			maxValue = inputArray[i];
    		}
    	}
    	return maxValue;
    }
    
    //method to get minimum number from array elements
    int getMin(int[] inputArray)
    {
    	int minValue = inputArray[0];
    
    	for (int i=1;i<inputArray.length;i++)
    	{
    		if(inputArray[i]< minValue)
    		{
    			minValue = inputArray[i];
    		}
    	}
    	return minValue;
    }
}


public class DifferenceBtMaxMinArray {
     
	public static void main(String[] args) {
		int n;
		
		//create object of scanner
		Scanner sc = new Scanner(System.in);
		
		//you have to enter number here 
		System.out.print("Enter number of elements you want to enter:");
		
		//read entered number and store it in "n"
		n=sc.nextInt();
		
		int arr[] =new int[n];
		
		for (int i=0;i<arr.length; i++) {
			System.out.print("Enter [" +(i+1) +"] element : ");
			arr[i] = sc.nextInt();
		}
		
		MinMaxInArray mm = new MinMaxInArray();
		
		
		//print max and min , difference of array elements
		System.out.println("Maximum value is:"  +mm.getMax(arr));
		System.out.println("Minimum value is:"  +mm.getMin(arr));
		int Difference = mm.getMax(arr) - mm.getMin(arr);
		System.out.print("Difference between minimum and maximum in array is:" +Difference);
        

	}
}

