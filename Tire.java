package project08;

public class Tire {
	public int maxRotation; //�ִ�ȸ����
	public int accumulatedRotation; // ����ȸ����
	public String location; //��ġ
	
	public Tire(int maxRotation, String location) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		if(accumulatedRotation < maxRotation) {
			accumulatedRotation++;
			System.out.println(location +"Ÿ�̾��� ���� ������ :" + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println(location +"Ÿ�̾� ��ũ");
			return false;
		}
				
	}
}
