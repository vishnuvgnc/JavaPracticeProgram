import java.util.*;
class PrimeNumber{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the random number");
		n = sc.nextInt();
		for ( int i=2; i<=n; i++){
			if (n%i == 0){
				System.out.println("Not a prime number");
				break;
			}
			else{
				System.out.println("Prime number");
				break;
			}
		}	
	}
}