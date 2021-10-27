package project08;

public class capter01view {
public static void main(String[] args) {
	capter01chid child = new capter01chid ("자바폰", "점검", 10);
	
System.out.println("상속받은 모델: " + child.model);
System.out.println("상속받은 색상: " + child.color);

System.out.println("자식 클래스 채널: " + child.channel);

child.poweron();
child.poweroff();
child.sendvoice("안녕하세요");
child.receivevoice("안녕하세요~");
child.sendvoice("무슨 일 있으신가요?");
child.hongup();


child.turnon();
child.changechannel(56);
child.turnoff();
}
}
