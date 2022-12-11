package ThursdayLab;

public class ReverseOfAnArray {

	public static void main(String[] args) {
		
		//initialize array
		int[]arr=new int[] {55,56,57,58,59};
			System.out.println("Original array:");
		    for(int i=1;i<arr.length;i++)
		    {
		    	System.out.println(arr[i]+" ");
		    }
		    
		    System.out.println();
		    System.out.println("Array in reversed order:");
		    
		    //loop through the array in reverse order
		    for(int i = arr.length-1;i>=0;i--)
		    {
		    	System.out.print(arr[i]+ " ");
		    }

	}

}
