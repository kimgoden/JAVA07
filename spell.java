package project08;

class casting {
	public String ĳ����() {
		return "�ֹ��� �ܿ��.";
	}

}
class fire extends casting {
	public String fire() {
		return "���̾!" + super.ĳ����();
	}
}

class light extends casting {
	public String light() {
		return "��������!" + super.ĳ����();
	}
}
class ice extends casting {
	public String ice() {
		return "���̽���!"+ super.ĳ����();
	}
}
public class spell {
	public static void main(String[] args) {
		spell [] book = new spell[3];
		
		book[0] =  new fire();
		book[1] =  new light();
		book[2] =  new ice();
		
	for(int i =0; i <3; i++) {
		System.out.println(book[i].ĳ����());
	}
}
}