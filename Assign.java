class Assgn{
	public static void main(String[] args){
		// addition of two matrices
		int a[][]={{1,2,3},{4,5,6},{2,1,4}};
		int b[][]={{1,2,3},{1,2,3},{2,1,4}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("***********************");
		
		//multiplication of two matrices
		int x[][]={{1,2,3},{4,5,6}};
		int y[][]={{1,2,3},{1,2,3}};
		int z[][]=new int[2][3];
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				z[i][j]=x[i][j]*y[i][j];
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("***********************");
		
		// arranging array in descending order
		int arr[]={5,6,8,2,1,4};
		int temp=0;
		for(int val:arr){
			System.out.print(val+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			
			}
		}
		
		
		System.out.println("Elements of array sorted in descending order: ");
		for(int val:arr){
			System.out.print(val+" ");
		}
		System.out.println();
		
		System.out.println("***********************");
		
	}
}