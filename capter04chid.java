package project08;

public class capter04chid extends capter04 {
	int age = 27;
	
	public void info() {
		super.info();
		System.out.println("자식객체 info() 이름: " + this.name1);
		System.out.println("자식객체 info() 나이: " + this.age);
	}
	

}
