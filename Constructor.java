class Employee{
	int employeeId;
	String employeename;
	double salary;
	String gender;
	
	Employee(int employeeId,String employeename,double salary,String gender){
		System.out.println("Constructor invoked !!!");
		this.employeeId=employeeId;
		this.employeename=employeename;
		this.salary=salary;
		this.gender=gender;
	}
}


class constructor{
	public static void main(String[] args){
		Employee e1=new Employee(1,"A",10000.0,"Male");
		Employee e2=new Employee(2,"B",20000.0,"female");
		Employee e3=new Employee(3,"C",10000.0,"female");
		System.out.println(e1.employeeId+" "+e1.employeename+" "+e1.salary+" "+e1.gender);
		System.out.println(e2.employeeId+" "+e2.employeename+" "+e2.salary+" "+e2.gender);
		System.out.println(e3.employeeId+" "+e3.employeename+" "+e3.salary+" "+e3.gender);
		
		
		
		
		
	}
	
}