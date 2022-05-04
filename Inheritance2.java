//multilevel inhertance and overriding

class A{
	int x=50;
	int y=100;
	
	void m1(){
		System.out.println("A:m1()");
	}
	
	void m2(){
		System.out.println("A:m2()");
	}
	
	void m4(){
		System.out.println("A:m4()");
	}
}

class B extends A{
	void m4(){
		System.out.println("B:m4()");
	}
	
	void m5(){
		System.out.println("B:m5()");
	}
}

class C extends B{
	void m2(){
		System.out.println("C:m2()");
	}
	
	void m4(){
		System.out.println("C:m4()");
	}
	
}

class TestInheritance2{
	public static void main(String...args){
		C c1=new C();
		System.out.println(c1.x+" "+c1.y);
		c1.m2();
		c1.m4();
		c1.m1();
		
		System.out.println();
		
		A a1=new C();
		a1.m1();
		a1.m2();
		a1.m4();
		
		System.out.println();
		
		A a2=new B();
		a2.m1();
		a2.m2();
		a2.m4();
		//a2.m5(); compile time error
	}
}