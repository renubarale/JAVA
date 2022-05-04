class Student{
	private String name;
	private int roll_no;
	private String address;
	private String dept_name;
	
	/*
	public Student(String name,int roll_no,String address,String dept_name){
		this.name=name;
		this.roll_no=roll_no;
		this.address=address;
		this.dept_name=dept_name;
	}
	*/
	
	// getter methods
	public String getName(){
		return this.name;
	}
	
	public int getRoll_no(){
		return this.roll_no;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public String getDept_name(){
		return this.dept_name;
	}
	
	//setter methods
	public void setName(String name){
		this.name=name;
	}
	
		public void setRoll_no(int roll_no){
		this.roll_no=roll_no;
	}
	
		public void setAddress(String address){
		this.address=address;
	}
	
		public void setDept_name(String dept_name){
		this.dept_name=dept_name;
	}
	
}