class ReversedString{
	public static void main(String[] arg){
		String str = "adbjnvcj";
		String reverse = " ";
		char chr;
		for (int i = 0; i<str.length(); i++){
			chr =  str.charAt(i);
			reverse = chr + reverse;
		}
		System.out.println(reverse);
	}
}