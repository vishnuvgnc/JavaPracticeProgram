import java.util.*;
class SumNumber{
	public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your n natural number");
	int n;
	n = sc.nextInt();
	int sum = 0;
	for ( int i = 1; i<=n; i++){
		sum = sum + i;
	}
	System.out.println("sum of the n natural number is " + sum);
	}
}