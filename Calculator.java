import java.util.Scanner;
class Calculator{
    static void addition(){
        System.out.println( "Addition Selected" );
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter the  first value: ");
        int valueOne = sc.nextInt();
        System.out.print(" Please enter the  second value: ");
        int valueTwo = sc.nextInt();
        System.out.println(" Addition of "+ valueOne + " and "+ valueTwo + " is = " +(valueOne + valueTwo) );
    }

    static void subtraction(){
        System.out.println( "Subtraction Selected" );
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter the  first value: ");
        int valueOne = sc.nextInt();
        System.out.print(" Please enter the  second value: ");
        int valueTwo = sc.nextInt();
        System.out.println(" Subtraction of "+ valueOne + " and "+ valueTwo + " is = " +(valueOne - valueTwo) );
    }

    static void multiplication(){
        System.out.println( "Multiplication Selected" );
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter the  first value: ");
        int valueOne = sc.nextInt();
        System.out.print(" Please enter the  second value: ");
        int valueTwo = sc.nextInt();
        System.out.println(" Multiplication of "+ valueOne + " and "+ valueTwo + " is = " +(valueOne * valueTwo) );
    }
    
    static void division(){
        System.out.println( "Division Selected" );
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter the  first value: ");
        int valueOne = sc.nextInt();
        System.out.print(" Please enter the  second value: ");
        int valueTwo = sc.nextInt();
        System.out.println(" Division of "+ valueOne + " and "+ valueTwo + " is = " +(valueOne / valueTwo) );
    }
    public static void main(String[] arg){
        System.out.println("calculator:");
        int operatorType;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Choose the operator from below: ");
            System.out.println(" 1. Addition");
            System.out.println(" 2. Subtraction ");
            System.out.println(" 3. Multiplication");
            System.out.println(" 4. Division ");
            System.out.println(" 5. Exit ");
            System.out.print("Please enter an operation: ");
            operatorType = sc.nextInt();
            switch(operatorType){
                case 1:
                addition();
                break;
                case 2:
                subtraction();
                break;
                case 3:
                multiplication();
                break;
                case 4:
                division();
                break;
                case 5:
                System.out.println("Exit");
                System.out.println("Bye Bye!");
                break;
                default: 
                System.out.println("Invalid operator selected!");
                break;
            }
        }while(operatorType != 5);
        sc.close();
    }

}
// int operatorIndex = operatorType;
        // switch(operatorIndex){
        //     case 1:
           