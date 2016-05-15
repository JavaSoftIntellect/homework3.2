import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter two numbers:");
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a>b){
			System.out.println(a + " is bigger.");
		}else if (a<b){
			System.out.println(b + " is bigger.");
		}else{
			System.out.println("The numbers are equal.");
		}

	}

}
