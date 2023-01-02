package Java;
import java.util.*;
public class project2 {

	
	public static void main(String[] args) {
	    int idade;
		
	    
	    Scanner leia = new Scanner (System.in);
		System.out.println("\nDigite sua idade...");
		idade = leia.nextInt();

		
				
		if(idade <16)
		{
			System.out.println("Você não está apto para votar...");
		}
		else if(idade >=16 && idade <18 || idade >65)
		{
			System.out.println("\nSeu voto é facultativo...");
		}
		else
		{
			System.out.println("\nSeu voto é Obrigatorio!!!");
		}
		
	}

	
}


