class A{
	public int a;
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public static int cnt=11;
	

public static  int disp() {
	return cnt;
	
}
}
class B{
	public int b;
	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public static int cnt=33;
	
	
	public static int disp() {
		
		return cnt;
	}
	
}

class C{
	public int c;
	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public static int cnt=22;
	
	public static int disp() {
		return cnt;
		
	}
	
}
public class Demo {

	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		C c1=new C();
		
		a1.setA(000);
		b1.setB(111);
		c1.setC(222);
		
		
		System.out.println("A = "+a1.getA());
		System.out.println(A.disp());
		System.out.println("B = "+b1.getB());
		System.out.println(B.disp());
		System.out.println("C = "+c1.getC());
		System.out.println(C.disp());
		
	}

}
