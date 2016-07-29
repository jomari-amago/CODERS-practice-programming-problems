import java.util.*;
class main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value for x: ");
		double x = s.nextDouble();
		System.out.print("Enter value for k: ");
		int k = s.nextInt();
		System.out.print(Math.pow(x,k));
	}
}