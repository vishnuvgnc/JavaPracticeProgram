import java.util.*;
class SmallestNumber{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter your  first number");
		a = sc.nextInt();
		int b;
		System.out.println("enter your second number");
		b = sc.nextInt();
		int c;
		System.out.println("Enter your  third number");
		c = sc.nextInt();
		int temp = (a<b)?a:b;
		int smallest = (c<temp)?c:temp;
		System.out.println("the smallest number is "+ smallest);

	}
}