import java.util.*;
class Factorize{
	public static void main(String[] arg){
		int number;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the number");
			number = sc.nextInt();
		}
		int sum = 0;
		for (int i=0; i<=number; i++){
				sum += i;
		}
		System.out.println("sum of all numbers upto "+ number + "is " +sum);
	}
}