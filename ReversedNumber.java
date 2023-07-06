class ReversedNumber{
	public static void main(String[] arg){
		int n = 4562;
		int reverse =0;
		int lastDigit;
		while(n !=0){
			lastDigit = n%10;
			reverse = reverse *10 + lastDigit;
			n = n/10;
		}
		System.out.println("the reversed number is "+reverse);
	}
}