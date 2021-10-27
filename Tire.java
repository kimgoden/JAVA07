package project08;

public class Tire {
	public int maxRotation; //최대회전수
	public int accumulatedRotation; // 누적회전수
	public String location; //위치
	
	public Tire(int maxRotation, String location) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		if(accumulatedRotation < maxRotation) {
			accumulatedRotation++;
			System.out.println(location +"타이어의 남은 수명은 :" + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println(location +"타이어 펑크");
			return false;
		}
				
	}
}
