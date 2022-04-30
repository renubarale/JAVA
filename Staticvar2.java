class Randomclass{
	static int x=100;
	static int y=200;
	
	static void m1(){
		System.out.println("Randomclass's m1");
		System.out.println("Inside class Randomclass m1' x is ="+(x));
		System.out.println("Inside class Randomclass m1' y is ="+(y));
		
	}
	
	static void m2(){
		System.out.println("Randomclass's m2 called");
	}
}




class Static2{
	static int x=50;
	static int y=60;
	static int p;
	static int q;
	
	public static void main(String[] args){
		
		int a=10;
		int b=20;
		
		System.out.println("a"+"="+(a));
		System.out.println("a"+"="+(b));
		System.out.println("x"+"="+(x));
		System.out.println("y"+"="+(y));
		f1();
		System.out.println("Randomclass's x"+"="+(Randomclass.x));
		System.out.println("Randomclass's y"+"="+(Randomclass.y));
		Randomclass.m1();
		Randomclass.m2();
		Randomclass.x=800;
		Randomclass.y=900;
		System.out.println("Randomclass's x changed value in static class is"+"="+(Randomclass.x));
		System.out.println("Randomclass's y changed value in static class is"+"="+(Randomclass.y));
		System.out.println("Uninitialized var p="+(p)); //default value is zero
		System.out.println("Uninitialized var q="+(q)); //default valur is zero
	}
	
	static void f1(){
		System.out.println("Static2 class's f1");
		x=600;
		y=500;
		System.out.println("Inside f1 x is ="+(x));
		System.out.println("Inside f1 y is ="+(y));
		
		
	}
}