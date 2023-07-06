class FrequencyArray{
	public static void main(String[] arg){
		int arr[] = new int[]{2,5,2,6,4,2,6,4,5,8,6,3};
		int frq[] = new int[arr.length];
		int visited = -1;
		for (int i = 0; i<arr.length; i++){
			int count = 1;
			for (int j = i+1; j<arr.length; j++){
				if (arr[i]==arr[j]){
					count++;
					frq[j] = visited;
				}
			}
			if (frq[i] != visited){
				frq[i]=count;
			}
		}
		System.out.println("Element | frequency");
		for (int i=0; i<frq.length; i++){
			if (frq[i] != visited){
				System.out.println(" |         "+ arr[i] + "      |     "+frq[i]+ "         |   ");
			}
		}
		System.out.println("------------------------------");
	}
}