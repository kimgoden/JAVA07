package project08;

public class capter01chid extends capter01 {
	int channel;
	capter01chid(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	void turnon() {
		System.out.println("ä��: " + channel + "�� ����� �մϴ�.");
	}
	void changechannel(int channel) {
		System.out.println("ä���� " + channel + "������ �����մϴ�.");
	}
	void turnoff() {
		System.out.println("����� �����մϴ�");
	}

}
