package Java;

import java.util.Scanner;

public class exercicios {

	  public static void main(String args[])
	    {
	        Scanner ler = new Scanner(System.in);
	        int menor21=0, maior50=0, idade=0;

	        while(idade >= 0)
	        {
	            System.out.printf("Entre com a sua idade: ");
	            idade = ler.nextInt();

	            if(idade <21 && idade > 0)
	            {
	                menor21 += 1;
	            }
	            if(idade > 50)
	            {
	                maior50 += 1;
	            }
	        }
	        System.out.println("Total de pessoas menores de 21 anos: "+menor21);
	        System.out.println("Total de pessoas maiores de 50 anos: "+maior50);
	    }
	}



import java.util.Scanner;

public class exercicios {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int soma=0,numero;
        System.out.println("Digite um número: ");

        do 
            {
            numero = leia.nextInt();
                if (numero>0)
                {
                    soma = numero + soma;
                }
            }
        while (numero!= 0);
        System.out.println("\nA soma dos números digitados foi: "+soma);

    }
}




public class exercicios {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num,somaPar=0,somaImpar=0,x;


        for (x=1;x<=10;x++)
        {
            System.out.println("\nEntre com um número: ");
            num = leia.nextInt();
            if (num % 2 == 0)
            {
                somaPar++; // somaPar = somaPar + 1
            }
            else

                {
                    somaImpar++;
                }

            }
            System.out.printf("\nTemos: "+somaPar+" números pares...");
            System.out.printf ("\nTemos: "+somaImpar+" números ímpares...");
        }
}


