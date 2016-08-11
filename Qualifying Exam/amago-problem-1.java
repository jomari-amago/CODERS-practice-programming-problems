import java.util.*;
class main{
	public static void main(String[]args){
		int i,y;
		String x = "";
		for(i=1;i<10;i++){
			x = x + Integer.toString(i);
			y = Integer.parseInt(x) * 8 + i;
			System.out.println(x + "=" +y);
		}
	}
}