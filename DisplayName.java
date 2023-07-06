import java.util.*;
class DisplayName {
	public static void main(String[] arg) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please Enter your Name.....");
			String name = sc.nextLine();
			System.out.println("Hello " + name + "!");
		}
	}
}	