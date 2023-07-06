import java.util.*;
class ArrayManipulation{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array size: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize]; 
        for (int i = 0; i<arraySize; i++){
            System.out.print("Enter value #" + (i+1));
            array[i] = sc.nextInt(); 
        }
        System.out.print("Your array [" );
        for (int i =0; i<arraySize; i++){
            System.out.print(array[i]);
            if(i < arraySize - 1){
                
                System.out.print(",");
            }
        }
        System.out.print("] ");
        
        

    }
}








































