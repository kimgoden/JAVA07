package project08;

public class product {
	int price;// ��ǰ�� ����
	int point; // ���� ����Ʈ

	product(int price) {
		this.price = price;
		point = (int) (price /10);
	}
}

class tv2 extends product {
	tv2() {
		super(100);
	}

	public String toString() {
		return "tv2";
	}
}

class computer extends product {
	computer() {
		super(200);
	}

	public String toString() {
		return "computer";
	}
}

class audio extends product {
	audio() {
		super(300);
	}

	public String toString() {
		return "audio";
	}
}

class buyer {
	product[] cart = new product[3];
	int money = 1000;
	int point = 0;
    int i;
	// void buy(tv2 t) {
	// money -= t.price;
	// point += t.point;
	// }
	// void buy(computer c) {
	// money -= c.price;
	// point += c.point;
	// }
	// void buy(audio a) {
	// money -= a.price;
	// point += a.point;
	// }
	void buy(product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����մϴ�");
			return;
		}
		money -= p.price;
		point += p.point;
		System.out.println(p.toString() + "�� �����ϼ̽��ϴ�.");
		add(p);
	}
	public void add(product p) {
		if(i >= cart.length) {
			product[] temp = new product[cart.length * 2];
			System.arraycopy(cart, 0, temp, 0, cart.length);
			cart = temp;
		}
		cart[i++] = p;
	
	return;
}
	void summary() {
		String itemlist = "";
		int sum = 0;
		for(int i =0; i<cart.length; i++) {
			if(cart[i] == null)
				break;
			itemlist += cart[i] + ",";
			sum += cart[i].price;
			
		}
		System.out.println("������ ����:" + itemlist);
		System.out.println("����� �ݾ�:" + sum);
		System.out.println("���ʽ� ����Ʈ: " + point);
		System.out.println("���� �ݾ�: " + money);
	}
}


