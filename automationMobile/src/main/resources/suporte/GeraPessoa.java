/**
* @author: Rodrigo Arriel
* Criação: 24/06/2020
* Classe: Classe de geração de dados para testes
*/

package suporte;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GeraPessoa {
	

	    public static void main(String[] args) {

	        // letras maisculas 65 - 90
	        // letras minúsculas 97 - 122

	        ThreadLocalRandom gerador = ThreadLocalRandom.current(); 

	        int tamanhoNome = gerador.nextInt(3, 10);
	        int tamanhoSobrenome = gerador.nextInt(3, 10);

	        char primeiraLetraNome = (char) gerador.nextInt(65, 90);
	        char primeiraLetraSobreNome = (char) gerador.nextInt(65, 90);

	        StringBuilder nome = new StringBuilder().append(primeiraLetraNome);
	        StringBuilder sobreNome = new StringBuilder().append(primeiraLetraNome);


	        for (int i = 1; i < tamanhoNome; i++) {
	            char letra = (char) gerador.nextInt(97, 122);
	            nome.append(letra);
	        }

	        for (int i = 1; i < tamanhoSobrenome; i++) {
	            char letra = (char) gerador.nextInt(97, 122);
	            sobreNome.append(letra);
	        }

	        System.out.println(nome + " " + sobreNome);
	    }
	}