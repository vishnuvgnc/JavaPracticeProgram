import java.util.*;
class Table{
	public static void main(String[] arg){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("which table you want!");
		n = sc.nextInt();
		int times;
		System.out.println("how many times you want");
		times = sc.nextInt();
		for (int i = 1; i<=times; i++){
			System.out.println( n +" * "+ i+" = "+n*i);
		}
	}
}