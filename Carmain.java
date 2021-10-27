package project08;

public class Carmain {
public static void main(String[] args) {
	int number = 10;
    Car a = new Car();//객체 생성
    boolean stop = false;
    
    
    while(!stop) {//와일 스위치문 케이스 써야함 은행했던 방식으로
    	int Run = a.run();
    	switch(Run) {
    	case 1:
    		System.out.println("왼쪽 앞에 타이어 교체필요");
    		a.frontLeftTire = new KorTire(15, "왼쪽 앞에 타이어");
    		break;
    	case 2:
    		System.out.println("오른쪽앞에 타이어 교체필요");
    		a.frontRightTire = new KorTire(15, "오른쪽 앞에 타이어");
    		break;
    	case 3:
    		System.out.println("왼쪽 뒤에 타이어 교체필요");
    		a.backLeftTire = new KumhoTire(15, "왼쪽 뒤에 타이어");
    		break;
    	case 4:
    		System.out.println("오른쪽 뒤에 타이어 교체필요");
    		a.backRightTire = new KumhoTire(15, "오른쪽 뒤에 타이어");
    		break;
    	}
    	number--;
    	if(number == 0) {
    		stop = true;
    	}
    }
}
}
