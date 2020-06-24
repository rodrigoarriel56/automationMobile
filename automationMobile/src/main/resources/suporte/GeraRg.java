/**
* @author: Rodrigo Arriel
* Criação: 24/06/2020
* Classe: Classe de geração de numero de RG para testes
*/

package suporte;

import java.util.Random;

public class GeraRg {

	@SuppressWarnings("unused")
	private int randomiza(int n)
	{
        int ranNum = (int) (Math.random() * n);
		return ranNum;
	}

	@SuppressWarnings("unused")
	private int mod(int dividendo, int divisor)
	{
		return (int) Math.round(dividendo - (Math.floor(dividendo / divisor) * divisor));
	}
	
	@SuppressWarnings("unused")
	public static String geraRg() 
	{
		String  nDigResult;
		String numerosContatenados;
		String numeroGerado;
		Random numeroAleatorio = new Random();
		//numeros gerados
		int n1 = numeroAleatorio.nextInt(10);
		int n2 = numeroAleatorio.nextInt(10);
		int n3 = numeroAleatorio.nextInt(10);
		int n4 = numeroAleatorio.nextInt(10);
		int n5 = numeroAleatorio.nextInt(10);
		int n6 = numeroAleatorio.nextInt(10);
		int n7 = numeroAleatorio.nextInt(10);
		int n8 = numeroAleatorio.nextInt(10);
		int n9 = numeroAleatorio.nextInt(10);

		//Conctenando os numeros
		numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3)  + String.valueOf(n4) +
				String.valueOf(n5) + String.valueOf(n6) + String.valueOf(n7) +String.valueOf(n8)  +
				String.valueOf(n9);
		numeroGerado = numerosContatenados;

		return numeroGerado;
		
	} 
	
	public static void main (String args[])
	{
		System.out.println(geraRg());
	}

	
}
