import java.util.*;
class main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		double a=0;
		System.out.print("Enter a three digit number:");
		int i = s.nextInt();
		int y = i; //passed the value of i to y
		while(y>0){
			int n = (y%10); //will get the modulo of the input number
			y = y/10; //get the quotient of the input number
			double x = Math.pow(n,3); //raise to three the inputted number
			a = a+x; //add the cubes of the number, repeat until the the y is less than 0
		}
			System.out.println((i==a)? i+" is an Armstrong number":i+" is not an Armstrong number");//compared if the sum of all cubes and the inputted number is equal
	}
}