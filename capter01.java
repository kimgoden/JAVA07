package project08;

public class capter01 {

	String model;
	String color;
	
	void poweron() {System.out.println("전원을 켭니다."); }
	void poweroff() {System.out.println("전원을 끕니다."); }
	void bell() { System.out.println("벨이 울립니다."); }
	void sendvoice(String message) {System.out.println("자신: " + message); }
	void receivevoice(String message) {System.out.println("상대방: " + message); }
	void hongup() {System.out.println("전화를 끊습니다."); }
	
}
