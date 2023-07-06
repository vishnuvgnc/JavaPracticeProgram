import java.util.*;
class phoneNumber {
	public static void main(String[] arg){
		System.out.println("Please Enter your phone number...");
		try (Scanner sc = new Scanner(System.in)) {
			String number = sc.nextLine();
			System.out.println("Your phone number is " + number);
		}
	}
}