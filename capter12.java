package project08;

class people {
	public void printinfo() {
		System.out.println("���� ����Դϴ�.");
	}
}

class  man extends people {
//��������̺�
   public void printinfo() {
	super.printinfo();
System.out.println("�׸��� �����Դϴ�.");
}
   public void army() {
	   System.out.println("���� ���븦 ���ٰ��?");
	   System.out.println("�� �Ȱ��Y��");
   }
}
class woman extends people {
//��������̺�
	public  void printinfo() {
		super.printinfo();
System.out.println("�׸��� �����Դϴ�.");
	}
	public void work() {
		System.out.println("���� ����Ѵٰ��?");
		System.out.println("�� �Ȱ��Y��");
	}
}



public class capter12 {
	
	public static void func(people people) {
		people.printinfo();
		if(people instanceof man) {
			((man)people).army();
		}
		if(people instanceof woman) {
			((woman)people).work();
		}
	}
public static void main(String[] args) {
	//man m = new man();
	//woman w = new woman();
	
	//m.printinfo();
	//((man)m).army();
	//System.out.println();
	//w.printinfo();
	//((woman)w).work();
	
	// �޼ҵ� �������̵� ������ȯ ����
	people m = new man();
	people w = new woman();
	func(m);
	
	System.out.println();
	func(w);
}
}
