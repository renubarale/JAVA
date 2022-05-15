//Write a program to print the names of students by creating a Student class. 
//If no name is passed while creating an object of Student class, then the name should be "Unknown",
//otherwise the name should be equal to the String value passed while creating object of Student class.

class Student{
	String name;
	
	void Student(String name){
		this.name=name;
		
	}
	
	void Student(){
		this.name="unknown";
	}
	
	void print(){
		System.out.println(this.name);
	}
	
}

class Overloading{
	public static void main(String[] args){
		Student s1=new Student();
		s1.Student("Renu");
		s1.print();
		
		Student s2=new Student();
		s2.Student();
		s2.print();
		
	}
	
}

