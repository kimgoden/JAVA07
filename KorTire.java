package project08;

public class KorTire extends Tire{
	
	public KorTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	public boolean roll() {
		if(accumulatedRotation < maxRotation) {
			accumulatedRotation++;
			System.out.println("�ѱ�Ÿ�̾��� ���� ������ :" + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("�ѱ�Ÿ�̾� ��ũ");
			return false;
		}
				
	}
}

