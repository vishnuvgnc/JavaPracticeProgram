import java.util.Scanner;

class ReverseArray {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i =0; i < size; i++){
            System.out.println("enter the array element" + (i+1));
            array[i] = sc.nextInt();
        }
        System.out.print("Your array is [ ");
        for (int i = 0; i<= size-1; i++){
            System.out.print(array[i]);
            if ( i+2 <= size){
                System.out.print(" , ");
            }
        }
        System.out.println(" ] ");
        System.out.print("Your reverse array is [");

        for ( int i = size -1; i > -1; i--){
            System.out.print(array[i]);
            if ( i > 0 ){
                System.out.print(" , ");
            }
        }
        System.out.print(" ] ");
    }
}
