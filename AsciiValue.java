import java.util.*;
class AsciiValue{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number or character");
		char chr;
		chr = sc.next().charAt(0);
		int asciiValue = chr;
		System.out.println("ASCII value is "+ asciiValue);
	}
}