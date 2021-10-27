package project08;

public class capter02view {
public static void main(String[] args ) {
	//자식 객체 이용
	capter02chid child = new capter02chid ("유재석" , "123456-1234567", 1);
	
	System.out.println("name: " + child.name);
	System.out.println("ssn: " + child.ssn);
	System.out.println("studentNo: " + child.studentNo);
}
}
