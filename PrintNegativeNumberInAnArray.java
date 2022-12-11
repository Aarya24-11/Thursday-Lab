package ThursdayLab;

import java.util.Scanner;

public class PrintNegativeNumberInAnArray {

	public static void main(String[] args) {
		 
		//creating scanner class object to take input
		Scanner sc = new Scanner(System.in);
		
		//read size of the array 
		System.out.println("Enter size of an array: ");
		int n= sc.nextInt();
		
		//creating an int array of size n
		int numbers[] = new int[n];
		
		//taking input for the array 
		System.out.println("Enter array elements:");
		for (int i=0;i<n;i++)
		{
			numbers [i] = sc.nextInt();
		}
		
		//display negative numbers
		displayNegative(numbers);
		
		//close scanner
		sc.close();
		
	}
	
	//method to display negative numbers
	public static void displayNegative(int[] numbers)
	{
		//variables
		boolean flag = false;
		int i=0;
		
		//check is there any negative numbers
		for (i = 0; i<numbers.length; i++)
		{
			if(numbers[i]<0)
			{
				flag = true;
				break;
			}
		}
		
		//negative number is not available
		if(!flag)
		{
			System.out.println("Array does not contain negative number");
			return;
		}
		
		//display negative number
		System.out.println("Negative number =");
		for (i=0; i< numbers.length; i++)
				{
					if(numbers[i]<0)
					{
						System.out.println(numbers[i]+" ");
					}
				}
	}

}
