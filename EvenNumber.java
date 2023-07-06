class EvenNumber{
	public static void main(String[] arg){
		int number = 100;
		System.out.println("Even numbers are :");
		for (int i = 1; i<=number; i++){
			if (i%2 == 0){
				System.out.print(i + " ");
			}
		}
	}
}