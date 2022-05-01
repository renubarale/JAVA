class Demo{
	static void m1(){
		System.out.println("Static Method of Demo.m1() is invoked!!");
		
	}
}


class InstanceMethod{
	int a=600;
	int b=200;
	static int o=100;
	
	{
		a=800;
		b=900;
	}
	
	void demo(){
		System.out.println("Instance Method demo() is invoked!!");
	}
	
	static void m1(){
		System.out.println("Static Method m1() is invoked!!");
	}
	
	public static void main(String[] args){
		System.out.println(o);
		InstanceMethod.m1();
		Demo.m1();
		
		InstanceMethod I1=new InstanceMethod();
		System.out.println(I1.a);
		System.out.println(I1.b);
		I1.demo();
		
		
	}
}