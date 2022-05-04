//hierarchical inheritance

class Animals{
	void eat(){
		System.out.println("Eating.....");
	}
}

class Dog extends Animals{
	
	void bark(){
		System.out.println("Barking.....");
	}
	
	void eat(){
		System.out.println("Dog:Eating.....");
	}
}

class Elephant extends Animals{
	
	void snort(){
		System.out.println("Snorting.....");
	
	}
	
	void eat(){
		System.out.println("Elephant:Eating.....");
	}
	
}

class TestIheritance3{
	public static void main(String...args){
		Animals a1=new Animals();
		a1.eat();
		//a1.snort();
		//a1.bark();
		
		System.out.println();
		
		Animals a2=new Dog();
		a2.eat();
		//a2.snort();
		//a2.bark();
		
		System.out.println();
		
		Dog d=new Dog();
		d.eat();
		d.bark();
		
		System.out.println();
		
		Elephant e=new Elephant();
		e.eat();
		e.snort();
		
		System.out.println();
		
		Animals a3=new Elephant();
		a3.eat();
		//a3.bark();
		//a3.snort();
		
	}
}