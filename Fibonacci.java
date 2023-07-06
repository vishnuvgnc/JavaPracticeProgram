import java.util.*;
class Fibonacci{
	public static void main(String[] args){
		
		try (Scanner sc = new Scanner(System.in)) {
			int number1;
			System.out.println("Enter the first number for fibonacci");
			number1 = sc.nextInt();
			int number2;
			System.out.println("Enter the second number for fibonacci");
			number2 = sc.nextInt();
			int count;
			System.out.println("how many times you want");
			count = sc.nextInt();
			int number3;
			for (int i=2; i<=count; i++){
				number3 = number1 + number2;
				System.out.print(" "+number3);
				number1 = number2;
				number2 = number3;
			}
		}
	}
}