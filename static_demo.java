class Random{
	static int r=40;
	static int s=90;
	static byte k;
	static float f;
	static{
		System.out.println("Random class's box invoked");
		f=27.02f;
		k=66;
	}
	static{
		System.out.println("Random class's box invoked");
	}
	
	static void f1(){
		System.out.println("Inside Random class's method");
		System.out.println("Inside Random class!! f is ="+(Random.f));
		System.out.println("Inside Random class!! s is ="+(Random.s));	
		
	}
	
}

class Random2{
	static void m1(){
		System.out.println("Inside Random2 class's method");
		System.out.println("Inside Random2 class!! r is ="+(Random.r));
		System.out.println("Inside Random2 class!! k is ="+(Random.k));	
	}
}

class Static3{
	
	static int x=500;
	static int y=1000;
	static int a;
	static int b;
	
	static{
		System.out.println("Inside static block of static3");
		a=100;
		b=200;
		
	}
	
	public static void main(String[] args){
		int p=10;
		int q=20;
		
		System.out.println("Local var of main method p="+(p));
		System.out.println("Local var of main method q="+(q));
		System.out.println("Static class's, x="+(x));
		System.out.println("Static class's, y="+(y));
		System.out.println("Static class's, a="+(a));
		System.out.println("Static class's, b="+(b));
		x=5;
		y=1;
		System.out.println("After changing value Static class's, x="+(x));
		System.out.println("After changing value Static class's, y="+(y));
		System.out.println("Method m1() is called");
		Random2.m1();
		System.out.println("Method f1() is called");
		Random.f1();
		
		
		
		
		
		
		
	}
	
	
	
}