package ArquivosJAR;

import java.util.Scanner;

public class exercicios {

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
			
		//inicio do exercicio 2

			int num[]= new int [10];
			int x,somaNum=0;
			float mediaNum;
			
			for(x=0;x<10;x++)
			{
				System.out.println("\nEntre com um numero...: ");
				num[x] = leia.nextInt();
				somaNum += num[x];
			}	
			mediaNum = somaNum /10;
			for(x=0;x<10;x++){
				if(num[x] % 2 == 1) {
					System.out.println("\nElementos de indece impar..."+num[x]);
					
				}
			}
			for(x=0;x<10;x++){
				if(num[x] % 2 == 0) {
					System.out.println("\nNumeros pares..."+num[x]);
				}
			}
			System.out.println("\nTotal...: "+somaNum);
			System.out.println("\nMedia total é...: "+mediaNum);

		
		}
		
	}
