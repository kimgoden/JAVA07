package project08;

public class productmain {
		public static void main(String[] args) {
			product p1 = new tv2();
			product p2 = new computer();
			product p3 = new audio();
			buyer b = new buyer();
			b.buy(p1);
			b.buy(p2);
			b.buy(p3);
			
			System.out.println("현재 남은 돈은 "+ b.money + "만원 입니다.");
			System.out.println("현재 적립 점수는" + b.point + "점 입니다.");
		}
	}


