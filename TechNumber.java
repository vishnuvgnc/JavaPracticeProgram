import java.util.*;

class TechNumber {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter your number");
        n = sc.nextInt();
        for (int i = 1; i <= 1000; i++) {
            if (isTechnumber(n)) {
                System.out.print(n + " is tech number");
                break;
            }else {
	            System.out.println(n + " is not a tech number");
	            break;
	        	}
        }
    }

    static boolean isTechnumber(int n) {
        int modulo, divide;
        int square = 0;
        while (n > 0) {
            modulo = n % 100;
            divide = n / 100;
			int sum = modulo + divide;           
            square = sum * sum;
            continue;
        }
        if (n == square) {
            return true;
        } else {
            return false;
        }
    }
}


// import java.util.*;
// class TechNumber{
// 	public static void main(String[] arg){
// 		Scanner sc = new Scanner(System.in);
// 		int n;
// 		System.out.println("Enter your number");
// 		n = sc.nextInt();
// 		for ( int i = 1; i <=1000; i++){
// 			if (isTechnumber(i)){
// 				System.out.println("It is tech number");
// 			}
// 		}
// 	}
// 	static boolean isTechnumber( int n){
// 		int modulo,divide;
// 		int square = 0;
// 		while(n>0){
// 			modulo = n%100;
// 			divide = n/100;
// 			int square1 = modulo * modulo;
// 			int square2 = divide * divide;
// 		    square = square1 + square2;
// 		    n = n/100; 
// 		}
// 		if (n == square){
// 			return true;
// 		}else{
// 			return false;
// 		}
// 	}
// }