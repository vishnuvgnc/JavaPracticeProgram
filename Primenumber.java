import java.util.*;
class Primenumber{
	public static void main(String[] arg){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		n =sc.nextInt();
		for (int i=2; i<n;i++){
			if(n % i == 0){
				System.out.println("It is not a prime number");
				break;
			}else{
				System.out.println("it is prime");
				break;
			}
		}	
	}
}