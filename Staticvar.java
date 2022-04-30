class Static{
	
	static int c=100;
	static int d=200;
	
	public static void main(String... args){
		int a=10;
		int b=20;
		System.out.println(a);
		System.out.println(b);
		a=60;
		b=90;
		System.out.println("a"+"="+(a));
		System.out.println("b"+"="+(b));
		m1();
		f1(); //static function call
		
		c=1000;
		d=2000;
		System.out.println("c"+"="+(c));
		System.out.println("d"+"="+(d));
		
		m1();
		
	}
	
	
	static void m1(){
		System.out.println("Inside m1 method");
		System.out.println("c"+"="+(c)); //will print static variables 
		System.out.println("d"+"="+(d));
	}
	
	
	static void f1(){
		int x=50;
		System.out.println("x"+"="+(x));
		//System.out.println(a); Not accessible(local var of main method)
	}
}