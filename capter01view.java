package project08;

public class capter01view {
public static void main(String[] args) {
	capter01chid child = new capter01chid ("�ڹ���", "����", 10);
	
System.out.println("��ӹ��� ��: " + child.model);
System.out.println("��ӹ��� ����: " + child.color);

System.out.println("�ڽ� Ŭ���� ä��: " + child.channel);

child.poweron();
child.poweroff();
child.sendvoice("�ȳ��ϼ���");
child.receivevoice("�ȳ��ϼ���~");
child.sendvoice("���� �� �����Ű���?");
child.hongup();


child.turnon();
child.changechannel(56);
child.turnoff();
}
}
