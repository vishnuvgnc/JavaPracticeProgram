import java.util.*;
class PetersonNumber{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n= sc.nextInt();

		if(isPeterson(n)){
			System.out.println("yes, you got it, This is Peterson Number");
		}else{
			System.out.println(" This is not a petersonNumber");
		}
	}	

	public static boolean isPeterson(int n){
		int sum = 0;
		int t = n;
		while(n>0){
			int lastDigit = n%10;//last digit findout
			sum = sum + factorize(lastDigit);
			n = n/10;
		}
		if(t == sum){
			 return true;
		}else{
			 return false;
		}			
	}

	public static int factorize(int lastDigit){
		int product = 1;
		for ( int i = 1; i<=lastDigit; i++){
				product = product * i;
		}
		return product;
	}	
}