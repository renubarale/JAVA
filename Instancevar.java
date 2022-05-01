class Instance{
	int var1=45;
	int var2=90;
	static int x=50;
	
	public static void main(String... args){
		int a=30;
		System.out.println("Local variable a="+(a));
		System.out.println("Static variable a="+(x));
		
		//System.out.println("Instance variable var1="+(var1)); //not allowed
		//System.out.println("Instance variable var2="+(var2)); //not allowed
		
		Instance in=new Instance();
		System.out.println("Instance variable of instance 'in' var2="+(in.var2));
		System.out.println("Instance variable of instance 'in' var1="+(in.var1));
		in.var1=450;
		in.var2=900;
		System.out.println("Instance variable of instance 'in' var2="+(in.var2));
		System.out.println("Instance variable of instance 'in' var1="+(in.var1));
		
		Instance A=new Instance();
		System.out.println("Instance variable of instance 'A' var2="+(A.var2));
		System.out.println("Instance variable of instance 'A' var1="+(A.var1));
		A.var1=100;
		A.var2=200;
		System.out.println("Instance variable of instance 'A' var2="+(A.var2));
		System.out.println("Instance variable of instance 'A' var1="+(A.var1));
		System.out.println("***********************************************************");
		in=A;
		System.out.println("Instance variable of instance 'in' var2="+(in.var2));
		System.out.println("Instance variable of instance 'in' var1="+(in.var1));
		System.out.println("Instance variable of instance 'A' var2="+(A.var2));
		System.out.println("Instance variable of instance 'A' var1="+(A.var1));
		
		
		
	}
	
}