class Person{
	String name;
	int age;
	
	void print(){
		System.out.println(this.name+" "+this.age);
	}
}


class Array{
	public static void main(String... args){
		int[] arr=new int[10];
		// or int arr1[]=new int[10];
		
		for(int i=1;i<10;i++){
			arr[i-1]=i*10;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=1;i<10;i++){
			System.out.print(arr[i-1]+" ");
		}
		
		System.out.println();
		
		Person[] Parr=new Person[5];
		
		Parr[0]=new Person();
		Parr[0].name="A";
		Parr[0].age=25;
		
		Parr[1]=new Person();
		Parr[1].name="B";
		Parr[1].age=26;
		
		Parr[0].print();
		Parr[1].print();
		
		Person p1=new Person();
		Parr[2]=p1;
		p1.name="C";
		p1.age=30;
		
		p1.print();
		
	}
}