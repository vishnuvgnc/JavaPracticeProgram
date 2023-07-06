class Name{
	private int age;
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}

class Demo{
	public static void main(String[] arg){
		Name n = new Name();
		n.setAge(18);
		System.out.println("This age will be "+ n.getAge());
	}
}

