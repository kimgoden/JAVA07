package project08;

public class Carmain {
public static void main(String[] args) {
	int number = 10;
    Car a = new Car();//��ü ����
    boolean stop = false;
    
    
    while(!stop) {//���� ����ġ�� ���̽� ����� �����ߴ� �������
    	int Run = a.run();
    	switch(Run) {
    	case 1:
    		System.out.println("���� �տ� Ÿ�̾� ��ü�ʿ�");
    		a.frontLeftTire = new KorTire(15, "���� �տ� Ÿ�̾�");
    		break;
    	case 2:
    		System.out.println("�����ʾտ� Ÿ�̾� ��ü�ʿ�");
    		a.frontRightTire = new KorTire(15, "������ �տ� Ÿ�̾�");
    		break;
    	case 3:
    		System.out.println("���� �ڿ� Ÿ�̾� ��ü�ʿ�");
    		a.backLeftTire = new KumhoTire(15, "���� �ڿ� Ÿ�̾�");
    		break;
    	case 4:
    		System.out.println("������ �ڿ� Ÿ�̾� ��ü�ʿ�");
    		a.backRightTire = new KumhoTire(15, "������ �ڿ� Ÿ�̾�");
    		break;
    	}
    	number--;
    	if(number == 0) {
    		stop = true;
    	}
    }
}
}
