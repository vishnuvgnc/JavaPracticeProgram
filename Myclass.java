public class Myclass{
	public static void main(String[] arg){
		int i= 0;
		while(i<10){
			System.out.println(i);
			i++;
			if (i  == 4){
				i++;
				break;
			}
		}
	}
}