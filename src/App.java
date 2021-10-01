import java.util.Scanner;
;public class App {
    public static void main(String[] args) throws Exception {
        Scanner input =  new Scanner(System.in);

        LISTA inicio = null;
		LISTA fim = null;
		LISTA aux = null;
		LISTA anterior = null;

		

		int numero, achou;

		

		System.out.println("Digite 5 números: ");

		

		for(int i = 0; i < 5; i++) {

			

			LISTA novo = new LISTA();

			novo.num = input.nextInt();

			

			if (inicio == null) {

				inicio = novo;

				fim = novo;

				novo.prox = null;

			}

			

			else {

				novo.prox = inicio;

				inicio = novo;

			}

		}

			

			aux = inicio;

			

			while(aux != null) {

				System.out.print(aux.num + " ");

				aux = aux.prox;

			}

			

			System.out.println("\nDigite o elemento a ser removido: ");

			numero = input.nextInt();

			

			aux = inicio;

			

			achou = 0;

			

			while (aux != null) {

				

				if (aux.num == numero) {

					achou = achou + 1;

					

					if(aux == inicio) {

						

						inicio = aux.prox;

						aux = inicio;

						

					}else if (aux == fim){

						

						anterior.prox = null;

						fim = anterior;

						aux = null;

						

					}else {

						anterior.prox = aux.prox;

						aux = aux.prox;

					}

							

				}

				

				else {

					anterior = aux;

					aux = aux.prox;

				}

			}

			

			if(achou == 0) {

				System.out.println("Número não encontrado!");

			}else {

				

				System.out.println("Nova Lista");

				

				aux = inicio;

				

				while (aux != null) {

					System.out.print(aux.num + " ");

					aux = aux.prox;

				}
          input.close();
			}}}