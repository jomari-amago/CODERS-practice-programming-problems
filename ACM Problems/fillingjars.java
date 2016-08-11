import java.util.*;
	class main{
		public static void main(String[]args){
			Scanner s = new Scanner(System.in);
			int ans = 0;
			int sum = 0;
			int n = s.nextInt();
			int m = s.nextInt();
				for(int i=1; i<=m; i++){
					int a = s.nextInt();
					int b = s.nextInt();
					int k = s.nextInt();
					ans  = ((b-a)+1) * k;//this formula is based on interval notation from Algebra
					sum = sum + ans;
				}
					ans = sum/n;
					System.out.print(ans);
		}
	}