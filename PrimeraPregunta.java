
import java.util.Scanner;

public class PrimeraPregunta {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		int m_1 [][] = new int [2][2];
		int m_2 [][] = new int [2][2];
		int m_3 [][] = new int [2][2];
		int m_4 [][] = new int [2][2];
		int m_resultante [][] = new int [2][2];
		
		//Llenado de la primera matriz
		System.out.println("Introduzca valores de la primera matriz");
		for (int i = 0; i < m_1.length; i++) {
			for (int j = 0; j < m_1[i].length; j++) {
				m_1[i][j] = Integer.parseInt(sc.next());
				
			}
			
		}
		
		
		//llenado de la segunda matriz
		System.out.println("Introduzca valores de la segunda matriz");
		for (int i = 0; i < m_2.length; i++) {
			for (int j = 0; j < m_2.length; j++) {
				m_2[i][j] = Integer.parseInt(sc.next());
				
			}
			
		}
		
		
		//llenado de la tercera matriz
		System.out.println("Introduzca valores de la tercera matriz");
		for (int i = 0; i < m_3.length; i++) {
			for (int j = 0; j < m_3.length; j++) {
				m_3[i][j] = Integer.parseInt(sc.next());
				
			}
			
		}
		
		
		//suma de matrices
		for (int i = 0; i < m_1.length; i++) {
			for (int j = 0; j < m_2.length; j++) {
				m_4[i][j] = m_1[i][j] + m_2[i][j];
				
				
			}
			
		}
		
		
		
		
		//imprimiendo las matrices
		for (int i = 0; i < m_1.length; i++) {
			
			for (int j = 0; j < m_1.length; j++) {
				System.out.print("[" + m_1[i][j] + "]");
				
			}
			
			if (i == 1) {
			    System.out.print("  +   ");	
			} else {
				System.out.print("      ");
				
			}
			
			
			for (int j = 0; j < m_2.length; j++) {
				System.out.print("[" + m_2[i][j] + "]");
				
			}
			
			if (i == 1) {
			    System.out.print("  =   ");	
			} else {
				System.out.print("      ");
				
			}
			
			for (int j = 0; j < m_4.length; j++) {
				System.out.print("[" + m_4[i][j] + "]");
				
			}
			System.out.println("");
			
		}
		
		
		
	}//cierra codigo main
}	
	