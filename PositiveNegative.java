import java.util.*;
class PositiveNegative{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		
			if (n<0){
				System.out.println( "It is negative number");
			}else if(n>0){
				System.out.println( "It is positive number");
			}else{
				System.out.println( "It is zero number");
			}
		
	}
}