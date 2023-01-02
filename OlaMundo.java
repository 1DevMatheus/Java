package Java;

import java.util.*;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		double n1, n2, n3, media;
		
		System.out.println("Entre com a primeira nota...");
		n1 = leia.nextFloat();
		System.out.println("Entre com a segunda nota..." );
		n2 = leia.nextFloat();
		System.out.println("Entre com a terceira nota... ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		System.out.println("\nMédia aritmética foi de: "+media);
		System.out.printf("\nMédia Aritmética foi de: %2.2f",media);
        
		
		if(media>=7) 
		{System.out.println("\nAlune Aprovade!!!"); } 

		else if(media>=5 && media<7)	
		{System.out.println("\nAlune de exame!!!");}
		
		else 
		{System.out.println("\nAlune Reprovade!!!");}
	}
	

}
