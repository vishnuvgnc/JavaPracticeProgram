import java.util.*;
class SimpleInterest{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int principal;
		System.out.println("Enter the Principal");
		principal = sc.nextInt();
		float interest;
		System.out.println("Enter the rate of interest");
		interest = sc.nextFloat();
		int year;
		System.out.println("Enter the time in no of years");
		year = sc.nextInt();
		float simpleInterest;
		simpleInterest = (principal*interest*year)/100;
		System.out.println("Principal "+ "=" + principal);
		System.out.println("Rate of Interest "+ "=" + interest);
		System.out.println("No of years "+ "=" +year);
		System.out.println("Simple Interest received would be Rs. "+simpleInterest);
	}
}