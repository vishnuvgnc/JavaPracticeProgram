import java.util.*;
class LargestNumber{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int[] arr;
		int size;
		System.out.println("enter the size of the array");
		size = sc.nextInt();
		arr = new int[size];
		for (int i=0; i<size; i++){
			System.out.println("enter the number "+ (i+1));
			arr[i] = sc.nextInt();
		}
		int largest = arr[0];
		for (int i = 1; i<size; i++){
			if (largest < arr[i]){
				largest = arr[i];
			}
		}
		System.out.println("Maximum number is "+ largest);
	}
}