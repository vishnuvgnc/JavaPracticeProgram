import java.util.*;
class SwapNumber{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		a = sc.nextInt();
		int b;
		System.out.println("Enter the number");
		b = sc.nextInt();
		System.out.println("Before swapping " + a + " , " + b );
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println("After swapping " + a + " , " + b );

	}
}