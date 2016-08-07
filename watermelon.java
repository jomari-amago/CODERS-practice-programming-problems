import java.util.*;
class main{
	public static void main(String[]args){
	Scanner s = new Scanner(System.in);
	System.out.print("Input: ");
	int n = s.nextInt();
	System.out.print((n%2==0 && n>0 && n<=100)? "Yes":"No");//A ternary condition whether a number is even or odd
	}
}
