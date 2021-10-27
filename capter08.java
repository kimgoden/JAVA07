package project08;

class capter08p {
public String x() {
	return "x";
}
}
class capter08chid extends capter08p {
	public String y() {
		return "y";
	}
}

public class capter08 {
	public static void main(String[] args) {
	capter08p ex = new capter08chid();	
	ex.x();
	//ex.y(); //에러 발생
}
}
