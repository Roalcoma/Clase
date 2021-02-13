import java.util.Arrays;
import java.util.Scanner;

public class MatrizIdentidad {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		int m_1 [][] = new int [10][10];
		
		//Llenado de la primera matriz
		for (int i = 0; i < m_1.length; i++) {
			m_1[i][i] = 1; 
	    }
		
		
		//Mostrar Matriz
		for (int i = 0; i < m_1.length; i++) {
			System.out.println(Arrays.toString(m_1[i]));
		}
			
		}
	}

