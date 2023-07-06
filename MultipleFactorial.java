import java .util.*;
class MultipleFactorial{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter your factorial number");
		number = sc.nextInt();
		int product = 1;
		for (int i=1; i<=number; i++){
			product = product*i;
		}
		System.out.println("your factorial is "+ number+ " is "+product);
	}
}