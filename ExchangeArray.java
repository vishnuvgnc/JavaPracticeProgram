import java.util.*;
class ExchangeArray{
 	public static void main(String[] arg){
 		int arr[] = new int[]{ 2,5,6,7,8,9};
 		int arr1[] = new int[arr.length];
 		for (int i = 0; i<arr.length; i++){
 			arr1[i] = arr[i];
 		}
 		System.out.println("The original elements are ");
 		for (int i=0; i<arr.length; i++){
 			System.out.print(arr[i] + " ");
 		}
 		System.out.println();

 		System.out.println("The Exchange numbers are ");
 		for (int i=0; i<arr1.length; i++){
 			System.out.print(arr1[i] + " ");
 		}
 		System.out.println();
 	}
}