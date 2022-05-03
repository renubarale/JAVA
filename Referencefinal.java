class A{
	int a=10;
	int b=20;
	
	void m1(){
		System.out.println("Instance method invoked");
	}
}


class Final{
	int c=55;
	int g=63;
	static int x=45;
	public static void main(String[] args){
		A a=new A();
		System.out.println(a.a);
		System.out.println(a.b);
		a.a=100;
		a.b=200;
		
		
		a=new A();
		System.out.println(a.a);
		System.out.println(a.b);
		
		final A a1=new A();
		System.out.println(a1.a);
		System.out.println(a1.b);
		a1.a=100; //allowed
		a1.b=200;
		System.out.println(a1.a);
		System.out.println(a1.b);
		
		a1=new A(); //not allowed
		System.out.println(a1.a);
		System.out.println(a1.b);
	}
}