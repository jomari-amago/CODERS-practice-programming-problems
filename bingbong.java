import java.util.*;
class main{
	public static void main(String[]args){
		for(int i =1;i<=15;i++){
			if(i%15==0){
				System.out.println("Bing Bong");
			}
			else if(i%5==0){
				System.out.println("Bong");
			}
			else if(i%3==0){
				System.out.println("Bing");
			}
			else{
				System.out.println(i);
			}
		}
	}
}