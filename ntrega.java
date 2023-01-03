package Java;

import java.util.Scanner;

public class ntrega {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3,media,somaMedia=0,mediaGeral;
		int x;
		
		for(x=1;x<=4;x++) {
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			System.out.printf("\nMÃ©dia: %3.2f",media);
			somaMedia += media; // somaMedia = somaMedia + media
		}
		mediaGeral = somaMedia / 4;
		System.out.println("\nMÃ©dia Geral: %3.2f"+mediaGeral);

	}

}

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


Scanner leia = new Scanner (System.in);
int soma=0,numero;
System.out.println("Digite um nÃºmero: ");

do 
    {
    numero = leia.nextInt();
        if (numero>0)
        {
            soma = numero + soma;
        }
    }
while (numero!= 0);
System.out.println("\nA soma dos nÃºmeros digitados foi: "+soma);

}

}