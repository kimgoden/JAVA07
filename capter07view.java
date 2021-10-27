package project08;

public class capter07view {
public static void main(String[] args) {
	capter07 parent = new capter07chid();
	//capter07chid child = new capter07chid();
	//capter07 parent = child;
	parent.method1();
    parent.method2(); //재정의된 메소드
    //parent.method3(); = 호출불가
}
}
