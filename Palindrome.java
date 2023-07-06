import java.util.*;
class Palindrome{
	public static void main(String[] arg){
		String x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your favorite letter");
		x = sc.nextLine();
		int i = 0;
		int j = x.length() - 1;
		while( i<j){
			if (x.charAt(i) != x.charAt(j)){
				System.out.println(" It is not a palindrome");
				break;
			}
			i++;
			j--;
			System.out.println(" wOW palindrome");
			break;
		}
	}
}