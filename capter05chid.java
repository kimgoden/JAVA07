package project08;

public class capter05chid  extends capter05 {
	public static final int nomal = 1;
	public static final int supersonic = 2;
	
	public int flymode = nomal;
	
	
	//오버드라이브
    public void fly () {
    	if(flymode == supersonic) {
    		System.out.println("초음속 비행중입니다.");
    		}else {
    			super.fly(); //부모객체 호출
    		}
    }
}
