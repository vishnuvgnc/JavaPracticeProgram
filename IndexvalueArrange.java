 class IndexvalueArrange {
     static int[] rotateArray(int[] inputArray, int startIndex){
          int size = inputArray.length;
          int[] outputArray = new int[size];
          for (int i = startIndex; i < size; i++){
               outputArray[i-startIndex] = inputArray[i];
          }
          for( int i = 0; i< startIndex; i++){
               outputArray[i+ size - startIndex] = inputArray[i];
          }
          return outputArray;
     }
     static int[] rotateArraytemp(int[] inputArray, int startIndex){
          int size = inputArray.length;
          int j = 0;
          int[] outputArray = new int[size];
          for (int i = startIndex; i < size; i++){
               outputArray[j] = inputArray[i];
               j = j+1;
          }
          for( int i = 0; i< startIndex; i++){
               outputArray[j] = inputArray[i];
               j = j+1;
          }
          return outputArray;
          
     }
     static int[] rotateArrayUsingModulo(int[] inputArray, int startIndex){
          int size = inputArray.length;
          int j = 0;
          int[] outputArray = new int[size];
          for (int i = 0; i < size; i++){
               j = (i + size - startIndex)% size;
               outputArray[j] = inputArray[i];
               
          }
          return outputArray;
          
     }
     static void printArray(int[] array){
          System.out.print("[");
          for (int i = 0; i< array.length ; i++){
               if (i>0){
                    System.out.print(" , " );
               }
               System.out.print(array[i]);
          }
          System.out.print(" ] ");
     }

    public static void main(String[] arg){
        int[] inputArray = { 10,5,3,25,1};
        int startIndex = 2;
        printArray(rotateArraytemp(inputArray, startIndex));  
        System.out.println(); 
        int[] input2 = {4, 9, 6, 6, 4, 8};
        printArray(rotateArray(input2, 4));
        System.out.println();
        int[] input3 = {4, 9, 9, 6, 8, 1};
        printArray(rotateArrayUsingModulo(input3, 2));
        System.out.println();
        int[] input4 = {4, 6, 4, 8};
        printArray(rotateArray(input4, 3));
        System.out.println();
        int[] input5 = {8};
        printArray(rotateArray(input5, 1));
        System.out.println();
    }    
}
