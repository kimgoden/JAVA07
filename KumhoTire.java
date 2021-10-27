package project08;

public class KumhoTire extends Tire {
	
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	public boolean roll() {
		if(accumulatedRotation < maxRotation) {
			accumulatedRotation++;
			System.out.println("금호타이어의 남은 수명은 :" + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("금호타이어 펑크");
			return false;
		}
				
	}
}