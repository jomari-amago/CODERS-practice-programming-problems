import java.util.*;
class main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		double sum = 0;
		int cases = s.nextInt();
			for(int i=1;i<=cases;i++){
				sum = 0;
				int num = s.nextInt();
				int pass = num;
				while(pass>0){
				int mod = pass%10;
				pass = pass/10;
				double raise = Math.pow(mod,3);
				sum = sum + raise;
				}
				System.out.println((num==sum)? num+ " is an Armstrong number": num+" is not an Armstrong number");
			}	
	}
}
