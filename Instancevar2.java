class Instance2{
	int x=10;
	int y=20;
	static int j=50;
	
	static{
		System.out.println("Static block invoked");
		j=100;
	}
	
	{
		System.out.println("init block invoked");
		x=1000;
		y=2000;
	}
	
	{
		System.out.println("init block invoked");
		x=300;
	}
	
	public static void main(String... args){
		Instance2 I=new Instance2();
		System.out.println("Instance var x="+(I.x));
		System.out.println("Instance var y="+(I.y));
		I.x=100;
		I.y=100;
		System.out.println("Instance var x="+(I.x));
		System.out.println("Instance var y="+(I.y));
		
		I=new Instance2(); //init block is invoked that many times we create object 
		System.out.println("Instance var x="+(I.x));
		System.out.println("Instance var y="+(I.y));
		
		I=new Instance2();
		System.out.println("Instance var x="+(I.x));
		System.out.println("Instance var y="+(I.y));
	}
}