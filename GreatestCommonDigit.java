import java.util.*;
class GreatestCommonDigit{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter the first value");
		x = sc.nextInt();
		int y;
		System.out.println("Enter the second value");
		y = sc.nextInt();
		while( x != y){
			if (x>y){
				x = x-y;
				System.out.println("The greatest common digit is " + x);
				break;
			}else{
				y = y-x;
				System.out.println("the greatest common digit is "+ y);
				break;
			}
		}
	}
}