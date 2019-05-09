/*Programmer: Adam Lyons
  Date: 4/10/2018
  Lab#: 17
  Purposse: Take two numbers from the user and display all even numbers between
*/
import java.util.Scanner;
public class LabSeventeen{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int numOne, numTwo;//Initializes variables for first and second numbers
		
		System.out.println("Enter a number");
		numOne = scan.nextInt();//Takes input from user for first number
		
		System.out.println("Enter a second number, greater than the first");
		numTwo = scan.nextInt();//Takes input from user for second number
		
		while(numTwo < numOne){//Checks if second number is higher than first number
				System.out.println("Invalid number. Enter a number greater than the first number.");
				numTwo = scan.nextInt();
		}//End of while
		
		for(int i = numOne + 1; i <= numTwo; i++){
			if(i % 2 == 0){
				System.out.println(i);
			}//End of if
		}//End of for
			
		
	}//End of main
	
}//End of class