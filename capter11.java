package project08;

class person {
	
		private int phone;
	
		public int getPhone() {
			return phone;
		}

		public void setPhone(int phone) {
			this.phone = phone;
		}

}

class professor extends person {
	public int getPhone() {
		return super.getPhone();
	}
}
public class capter11 {
public static void main(String[] args) {
	professor a = new professor();
	a.setPhone(123456789);
	System.out.println(a.getPhone());
	person p = a;
	System.out.println(p.getPhone());
}
}
