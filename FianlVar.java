class Final{
	final static int s=100;
	final static int q;
	
	static{
		q=50;
	}
	public static void main(String... args){
		final int a=10;//compile time constant
		final int b;//only constant
		b=20;
		int y=66;
		System.out.println(b);
		System.out.println(s);
		System.out.println(q);
		
		switch(a){
			case a:System.out.println(a);break; //allowed compile time constant as an argument in switch case
			//case b:System.out.println(b);break; //not allowed
			//case y:System.out.println(y);break; //not allowed
			
		}
		//Final2.x=500;
		System.out.println(Final2.x);//x=500 without final var and x=200 with final var
		
	}
}