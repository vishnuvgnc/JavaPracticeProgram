import java.util.*;
class PerfectSquare{
	public static void main(String[] arg){
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the perfect square number");
	n = sc.nextInt();
	int square =  (int) Math.sqrt(n);
	if (square*square == n){
		System.out.println("It is a perfect square");
	}else{
		System.out.println("it is not a perfect square");
	}
	}
}