
public class Examen2 {

	public static void main(String[] args) {
		
		int A[][] = {{1,2,3,4},{5,3,7,4},{8,5,3,9},{2,5,6,0}};
		int i = 0;
		boolean band = true;
		
		while((band) && (i < 3)) {
			
			for(int j = i+1; j < 4; j++) {
				
				if(A[j][i] != 0) {
					
					band = false;
					break;
					
				}
			}
			i = i + 1;
		}
		
		if(band)
			System.out.print("La matriz es triangular superior");
		
		
    }
}