//single level inheritance

class A{
	int a=20;
	int b=40;
	
	void m1(){
		System.out.println("A:m1()");
	}
	
}

class B extends A{
	void m1(){
		System.out.println("B:m1()");
	}	
}

class SingleInheritance{
	public static void main(String...args){
		B b=new B();
		System.out.println(b.a+" "+b.b);
		b.m1(); //class B's method invoked
		
		A a=new A();
		System.out.println(a.a+" "+a.b);
		a.m1();
		
		A a1=new B();
		System.out.println(a.a+" "+a.b);
		a1.m1();//class B's method invoked
		
	}
}
