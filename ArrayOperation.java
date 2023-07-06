import java.util.*;
class ArrayOperation {
    static Scanner sc = new Scanner(System.in);
    static void sum(int array[]){
        int arraySize = array.length;
        System.out.println("Sum is selected ");
        int sum = 0;
        for( int i =0; i< arraySize; i++){
                sum = sum + array[i] ;
        }
        System.out.println("The sum of all elements in the array is "+ sum );
        System.out.println();
    }
    static void searchIndex(int array[]){
        int arraySize = array.length;
        System.out.println(" Searching Index selected");
        System.out.print("Please enter the value to be searched :");
        int search = sc.nextInt();
        int index = -1;
        for (int i = 0; i< arraySize; i++){
            if ( array[i] == search){
                index = i;
                System.out.println(search + " is present at index " + index);
            }else{
                System.out.println(search + " is not present at index " + index);
                break;
            }
        }
    }
    static void searchValue(int array[]){
        int arraySize = array.length;
        System.out.println(" Searching value selected");
        System.out.print("Please enter the index to be searched :");
        int search = sc.nextInt();
        int index = array[0];
        for (int i = 0; i< arraySize; i++){
            if (array[i] == array[search]){
                index = array[i];
                System.out.println( search + "  the index value  "+index );
            }
        }
    }
    static void indexValueSearch(int array[]){
        int arraySize = array.length;
        System.out.println("search selected");
        System.out.print("Please enter the value to be searched :");
        int search = sc.nextInt();
        boolean isPresent = false;
        for (int i = 0; i< arraySize; i++){
            if( array[i] == search){
                isPresent = true;
                break;
            }
        }
        if (!isPresent){
            System.out.println( search + " is not present in the array");
        }else{
            System.out.println( search + " is present in the array");
        }
        
    }
    static void minimum(int array[]){
        int arraySize = array.length;
        System.out.println("Min selected");
        int minimum = array[0];
        for (int i = 1; i< arraySize; i++){
            if (minimum > array[i]){
                minimum = array[i];
            }
        }
        System.out.println(minimum + " is the minimum value in the array");
    }
    static void maximum(int array[]){
        int arraySize = array.length;;
        System.out.println("Max selected");
        int maximum = array[0];
        for (int i = 1; i< arraySize; i++){
            if (maximum < array[i]){
                maximum = array[i];
            }
        }
        System.out.println(maximum + " is the maximum value in the array");
    }
     public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the array size: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize]; 
        for (int i = 0; i<arraySize; i++){
            System.out.print("Enter value #" + (i+1) +"  ");
            array[i] = sc.nextInt(); 
        }
        System.out.print("Your array [" );
        for (int i =0; i<arraySize; i++){
            System.out.print(array[i]);
            if(i < arraySize - 1){
                
                System.out.print(",");
            }
        }
        System.out.println("] ");
        int choiceSelect;
        do{
            System.out.println("------------------------------------------------------------");
            System.out.println();   
            System.out.println("Choose operation fronm below options: ");
            System.out.println("1- Sum");
            System.out.println("2- Search by index");
            System.out.println("3- search by value");
            System.out.println("4- search for index");
            System.out.println("5- Min");
            System.out.println("6- Max");
            System.out.println("7- Exit");
            System.out.print("Please enter your choice: ");
            choiceSelect = sc.nextInt();
            
            switch(choiceSelect){
                case 1:
                sum(array);
                break;

                case 2:
                searchIndex(array);
                break;

                case 3:
                searchValue(array);
                break;

                case 4:
                indexValueSearch(array);
                break;
                
                case 5:
                minimum(array);
                break;

                case 6:
                maximum(array);
                break;

                case 7:
                System.out.println("Bye Bye!");
            }
        }while(choiceSelect != 7);
    }
    
}
