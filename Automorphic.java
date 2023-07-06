import java.util.*;
class Automorphic{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int givenNumber;
		System.out.println("Enter the number");
		givenNumber = sc.nextInt();

		int square = givenNumber * givenNumber;

		while(givenNumber > 0){
			if(givenNumber%10 != square%10){
				System.out.println("it is not a automorphic");
				break;
			}
			else{
                givenNumber = givenNumber/10;
                square = square/10;
                if(givenNumber == square){
                    System.out.println("yes! it is automorphic number");
            	}
            	continue;
            }					
		}
	}
}