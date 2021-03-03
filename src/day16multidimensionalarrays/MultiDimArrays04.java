package day16multidimensionalarrays;

public class MultiDimArrays04 {

	public static void main(String[] args) {

		String arr[][] = { {"A", "B", "M", "Y"}, {"e", "K"}, {"L", "e", "X"} };
		//Print "Bee" on the console
		for(int i=0; i<arr.length; i++) {
			
			String s = "";
			
			for(int j=0; j<arr[i].length;j++) {
				
				if(arr[i][j].equals("B")) {
					s=s+arr[i][j];
					break;
					
				}else if(arr[i][j].equals("e")) {
					s=s+arr[i][j];
					break;
					
				}
				
			}
			System.out.print(s);
		}
		
		
		
	
		
		
		
		
		

	}

}
