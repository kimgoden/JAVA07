package project08;

public class KumhoTire extends Tire {
	
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	public boolean roll() {
		if(accumulatedRotation < maxRotation) {
			accumulatedRotation++;
			System.out.println("��ȣŸ�̾��� ���� ������ :" + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("��ȣŸ�̾� ��ũ");
			return false;
		}
				
	}
}