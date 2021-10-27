package project08;

public class capter06chid  extends capter06 {
	void infor() {
		age = 27;
		name = "김형준";
		height = 170;	
		setWeight(62);
	}			
	public static void main(String[] args) {
		capter06chid child = new capter06chid();
		child.infor();

System.out.println("나이: " + child.age);
System.out.println("이름: " + child.name);
System.out.println("키: " + child.height);
System.out.println("몸무게: " + child.getWeight());

}
}