package project08;

public class productmain {
		public static void main(String[] args) {
			product p1 = new tv2();
			product p2 = new computer();
			product p3 = new audio();
			buyer b = new buyer();
			b.buy(p1);
			b.buy(p2);
			b.buy(p3);
			
			System.out.println("���� ���� ���� "+ b.money + "���� �Դϴ�.");
			System.out.println("���� ���� ������" + b.point + "�� �Դϴ�.");
		}
	}


