package project08;

public class capter05chid  extends capter05 {
	public static final int nomal = 1;
	public static final int supersonic = 2;
	
	public int flymode = nomal;
	
	
	//��������̺�
    public void fly () {
    	if(flymode == supersonic) {
    		System.out.println("������ �������Դϴ�.");
    		}else {
    			super.fly(); //�θ�ü ȣ��
    		}
    }
}
