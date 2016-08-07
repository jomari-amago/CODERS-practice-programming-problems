import java.util.*;
class main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		System.out.print((n>20 || n ==2 || n==4)? "Not weird": "Weird"); //A ternary conditon that determines whether a number is weird or not
	}
}
