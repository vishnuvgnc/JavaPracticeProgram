import java.util.Scanner;
class Occurence{
	public static void main(String[] arg){
		int[] arr;
		int count;
		try (Scanner sc = new Scanner(System.in)) {
			int size;
			System.out.println("enter the size of the array");
			size = sc.nextInt();
			arr = new int[size];
			for ( int i=0; i<size; i++){
				System.out.println(" Please enter the item " + (i+1));
				arr[i] = sc.nextInt();	
			}
			System.out.println("enter the item to count");
			count = sc.nextInt();
			int check = 0;
			for (int i=0; i<size; i++){
				if (count == arr[i]){
					check++;
				}
			}
			System.out.println( "no of occurrence "+ check);
		}
	}
}