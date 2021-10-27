package project08;

class casting {
	public String 캐스팅() {
		return "주문을 외운다.";
	}

}
class fire extends casting {
	public String fire() {
		return "파이어볼!" + super.캐스팅();
	}
}

class light extends casting {
	public String light() {
		return "레이저빔!" + super.캐스팅();
	}
}
class ice extends casting {
	public String ice() {
		return "아이스볼!"+ super.캐스팅();
	}
}
public class spell {
	public static void main(String[] args) {
		spell [] book = new spell[3];
		
		book[0] =  new fire();
		book[1] =  new light();
		book[2] =  new ice();
		
	for(int i =0; i <3; i++) {
		System.out.println(book[i].캐스팅());
	}
}
}