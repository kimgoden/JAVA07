package project08;

class ai {
	public String x() {
		return "ai.x";
	}
}
class bi extends ai{
	//오버드라이브
	public String x() {
		return "bi.x";
	}
	public String y() {
		return "bi.y";
	}
}

public class capter09 {
public static void main(String[] args) {
	ai ex = new bi();
	System.out.println(ex.x());
}
}
