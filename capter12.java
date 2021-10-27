package project08;

class people {
	public void printinfo() {
		System.out.println("나는 사람입니다.");
	}
}

class  man extends people {
//오버드라이브
   public void printinfo() {
	super.printinfo();
System.out.println("그리고 남자입니다.");
}
   public void army() {
	   System.out.println("내일 군대를 간다고요?");
	   System.out.println("난 안가는뎋ㅎ");
   }
}
class woman extends people {
//오버드라이브
	public  void printinfo() {
		super.printinfo();
System.out.println("그리고 여자입니다.");
	}
	public void work() {
		System.out.println("내일 출근한다고요?");
		System.out.println("난 안가는뎋ㅎ");
	}
}



public class capter12 {
	
	public static void func(people people) {
		people.printinfo();
		if(people instanceof man) {
			((man)people).army();
		}
		if(people instanceof woman) {
			((woman)people).work();
		}
	}
public static void main(String[] args) {
	//man m = new man();
	//woman w = new woman();
	
	//m.printinfo();
	//((man)m).army();
	//System.out.println();
	//w.printinfo();
	//((woman)w).work();
	
	// 메소드 오버라이딩 강제변환 예제
	people m = new man();
	people w = new woman();
	func(m);
	
	System.out.println();
	func(w);
}
}
