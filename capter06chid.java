package project08;

public class capter06chid  extends capter06 {
	void infor() {
		age = 27;
		name = "������";
		height = 170;	
		setWeight(62);
	}			
	public static void main(String[] args) {
		capter06chid child = new capter06chid();
		child.infor();

System.out.println("����: " + child.age);
System.out.println("�̸�: " + child.name);
System.out.println("Ű: " + child.height);
System.out.println("������: " + child.getWeight());

}
}