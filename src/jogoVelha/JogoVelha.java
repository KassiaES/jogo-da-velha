package jogoVelha;

import java.util.Scanner;

public class JogoVelha {
	
	public static void main (String args []){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do primeiro jogador, que vai atuar com X : ");
		String jog1 = scan.next();
		int vitoriasJog1 = 0;
		System.out.println("Digite o nome do segundo jogador, que vai atuar com O : ");
		String jog2 = scan.next();
		int vitoriasJog2 = 0;
		System.out.println("Digite o número de partidas: ");
		int partidas = scan.nextInt();
		
		String [][] matrizJogo = new String [3][3];
		zerarTabela(matrizJogo);
		
		for (int p = 0; p < partidas; p++) {
			
		//	do {
			//	int linha = getLinha();
			//	int coluna = getColuna();
			
			Scanner scann = new Scanner(System.in);
	        System.out.println("Digite a linha (1 a 3):");
	        int linha = scann.nextInt();
	        
			System.out.println("Digite a coluna (1 a 3):");
	        int coluna = scann.nextInt();
	        scann.close();
				imprimeTabela(1, matrizJogo,linha,coluna);
			
			//conferir se deu vitoria
			//conferir se matriz completa
		//	while { viorias = 0
			
			if (vitoriasJog1 == vitoriasJog2) p++;
		}
		scan.close();
	}
	
	public static String [][] zerarTabela(String [][] matrizJogo) {		
		for (int i = 0; i < matrizJogo.length; i++) {
			for (int j = 0; j < matrizJogo[i].length; j++) {
				matrizJogo [i][j] = " ";
				System.out.print("[" + matrizJogo[i][j] + "]");
			}
			System.out.println(" ");
		}
		return matrizJogo;
	}
	
	

	public static int getLinha() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Digite a linha (1 a 3):");
        int l = scann.nextInt();
        scann.close();
        return l;
	}
	
	public static int getColuna() {
		Scanner scann = new Scanner(System.in);
		System.out.println("Digite a coluna (1 a 3):");
        int coluna = scann.nextInt();
        scann.close();
        return coluna;
	}
        
	public static String[][] imprimeTabela(int jogador, String [][]matrizJogo, int linha, int coluna) {
		
		for (int i = 0; i < matrizJogo.length; i++) {
			for (int j = 0; j < matrizJogo[i].length; j++) {
				if ((linha-1) == i && (coluna-1) == j) {
					if (jogador == 1) {
						matrizJogo [i][j] = "X";
					} else matrizJogo [i][j] = "O";
				}
				System.out.print("[" + matrizJogo[i][j] + "]");
			}
			System.out.println(" ");
		}
		return matrizJogo;
	}
	
}
