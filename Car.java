package project08;

public class Car {//��������̺� ����?? ������ Ʋ�����ΰ�?
	Tire frontLeftTire = new Tire(6,"�տ���");
	Tire frontRightTire = new Tire(2,"�տ�����");
	Tire backLeftTire = new Tire(3,"�ڿ���");
	Tire backRightTire = new Tire(5,"�ڿ�����");
	
  
  
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
	  System.out.println("������ �����մϴ�.");
}
}