import java.util.*;
class main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		double arctan = 0;
		int sign = 1;
		int j = 1;
		System.out.print("Enter value for x: ");
		double x = s.nextDouble();
		System.out.print("Enter value for k: ");
		int k = s.nextInt();
			for(int i=1;i<=k;i++){
				
				arctan = arctan+(sign*(Math.pow(x,j))/j);
				j = j + 2;
				sign = sign * -1;
			}
			System.out.print(arctan);
		}
	}