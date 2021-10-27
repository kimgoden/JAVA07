package project08;

public class Car {//오버드라이브 오류?? 순서가 틀려서인가?
	Tire frontLeftTire = new Tire(6,"앞왼쪽");
	Tire frontRightTire = new Tire(2,"앞오른쪽");
	Tire backLeftTire = new Tire(3,"뒤왼쪽");
	Tire backRightTire = new Tire(5,"뒤오른쪽");
	
  
  
  public int run() {
	  if(frontLeftTire.roll() == false) {
		  stop();
		  return 1;
	  }
	  if(frontRightTire.roll() == false) {
		  stop();
		  return 2;
	  }
	  if(backLeftTire.roll() == false) {
		  stop();
		  return 3;
	  }
	  if(backRightTire.roll() == false) {
		  stop();
		  return 4;
	  }
	  return 0;
  }
  void stop() {
	  System.out.println("운행을 중지합니다.");
}
}