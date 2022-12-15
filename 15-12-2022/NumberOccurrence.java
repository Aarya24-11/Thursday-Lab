package ThursdayLab;

import java.util.Scanner;

public class NumberOccurrence {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
 String input;
char ch;
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter String: ");
input=sc.nextLine();
System.out.println("enter a element to find out occurrence of element");
ch=sc.next().charAt(0);
for(int i=0;i<input.length();i++)
{
	if(input.charAt(i)==ch)
	{
		count++;
	}
}
System.out.println("element "+ch+" occurs "+count+" times");




	}
		
	}
