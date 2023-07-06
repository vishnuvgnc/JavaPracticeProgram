import java.util.*;
class CheckTheSquare{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		double length = sc.nextDouble();
		System.out.println("Enter the Breadth");
		double breadth = sc.nextDouble();
		if(length != breadth){
			System.out.println("this number is Square");
		}else{
			System.out.println("Not a square");
		}
	}
}