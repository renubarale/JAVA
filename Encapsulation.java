class TestEncapsulation{
	public static void main(String...args){
		/*
		Student s=new Student("Renu",1,"Kolhapur","DBDA");
		
		System.out.print(s.getName()+" ");
		System.out.print(s.getRoll_no()+" ");
		System.out.print(s.getAddress()+" ");
		System.out.print(s.getDept_name()+" ");
		*/
		
		Student s1=new Student();
		s1.setName("Krishna");
		s1.setRoll_no(2);
		s1.setAddress("Mumbai");
		s1.setDept_name("DBDA");
		
		System.out.println(s1.getName()+" "+s1.getRoll_no()+" "+s1.getAddress()+" "+s1.getDept_name());
		
	}
}