package project08;

public class product {
	int price;// 제품의 가격
	int point; // 적립 포인트

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
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= p.price;
		point += p.point;
		System.out.println(p.toString() + "을 구입하셨습니다.");
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
		System.out.println("구입한 물건:" + itemlist);
		System.out.println("사용한 금액:" + sum);
		System.out.println("보너스 포인트: " + point);
		System.out.println("남은 금액: " + money);
	}
}


