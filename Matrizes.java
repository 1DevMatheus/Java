package ArquivosJAR;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int nota [][] = new int [10][4];
			float media;
			int somaMedia=0,mediaTurma;
			
			for(int x=0;x<10;x++) {
				for(int i=0;i<4;i++)
				{
				System.out.println("\nEntre com a "+(i+1)+"º nota do "+(x+1)+"º alune.");
				nota [x][i] = leia.nextInt();
				}
			}
			System.out.println("\nMedia dos alunes...");
			for(int x=0;x<10;x++) {
				for(int i=0;i<4;i++)
					somaMedia += nota[x][i];
				media = somaMedia /4;
				somaMedia = 0;
				System.out.printf("%.1f | ",media);
			}
			
					
	}
	
	

}
