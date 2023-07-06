import java.util.*;
class ArrayElementAddition{
	public static void main(String[] arg){
		int[] arr;
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		arr = new int[size];
		for ( int i = 0; i<size; i++){
			System.out.println("Enter the number " +(i+1));
			arr[i] = sc.nextInt();

		}
		int sum = 0;
		int i;
		for ( i = 0; i< arr.length; i++){			
				 sum += arr[i];	 
		}
		System.out.println("Addition of the element "+sum);		
	}
}