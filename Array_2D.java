class Arr_2D{
	public static void main(String[] args){
		int[][] arr2d = new int[2][5];
		int counter = 0;
		for(int i=0;i<2;i++){
			for (int j=0;j<5;j++){
				/*if(i == 0){
					arr2d[i][j] = (j+1) * 2;
				}else{
					arr2d[i][j] = (j+1) * 3;
				}*/
				arr2d[i][j] = counter++;
				
			}
		}
		
		
		for(int i=0;i<arr2d.length;i++){
			for (int j=0;j<arr2d[i].length;j++){
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
		
		// initializing array in same line
		int arr[]={10,20,20,40,50};
		//for each loop
		for(int val:arr){
			System.out.print(val+" ");
		}
		System.out.println();
		
		
		
		int ar2d[][]={
			{10,20},
			{30,40},
			{50,60},
			{70,80}
			};
			
		
		for(int[] row : ar2d){
			for(int val : row){
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}

