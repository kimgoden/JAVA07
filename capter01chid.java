package project08;

public class capter01chid extends capter01 {
	int channel;
	capter01chid(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	void turnon() {
		System.out.println("채널: " + channel + "번 방송을 켭니다.");
	}
	void changechannel(int channel) {
		System.out.println("채널을 " + channel + "번으로 변경합니다.");
	}
	void turnoff() {
		System.out.println("방송을 종료합니다");
	}

}
