package project08;

class object {
 public object () {
 }

public void draw() {
	System.out.println("cpater10 draw");
	
    }
}

class line extends object {
	//오버드라이브
	public void draw() {
		System.out.println("line draw");
	}
}

class rect extends object {
	//오버드라이브
	public void draw() {
		System.out.println("rect draw");
	}
}

class ciecle extends object {
	//오버드라이브
	public void draw() {
		System.out.println("cielce draw");
	}
}
public class capter10{
public static void main(String[] args) {
	object cp = new object();
	line li  = new line ();
	object p = new line ();
	//object r = li();
	object r = new line ();
	
	cp.draw();
	li.draw();
	p.draw();
	r.draw();
	
	object re = new rect();
	object ci = new ciecle();
	re.draw();
	ci.draw();
	
}
}