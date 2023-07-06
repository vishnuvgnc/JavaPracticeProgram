class Amstrong{
	public static void main(String[] arg){
		int n=153;
		int temp;
		int ams = 0;
		int original = n;
		while(n > 0){
			temp = n%10;
			temp = (int) Math.pow(temp,3);
			ams = ams + temp;
			n= n/10;
		}
		if (ams == original){
			System.out.println("This is amstrong number");
		}else{
			System.out.println("not a amstrong number");
		}
	}
}