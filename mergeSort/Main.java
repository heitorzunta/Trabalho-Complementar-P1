import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int cardinalidade;
		
		String[] palavras;
		
		Scanner sc = new Scanner(System.in);
		
		cardinalidade = sc.nextInt();
		sc.nextLine();
		
		palavras = new String[cardinalidade];
		
		for(int i=0; i<cardinalidade; i++) {
			palavras[i] = sc.nextLine();	
		}
		
		mergeSort(palavras, 0, palavras.length-1);

		print(palavras);
		
		sc.close();		

	}

	private static void mergeSort(String[] array, int inicio, int fim) {

		int meio = (inicio + fim) / 2;

		//conquista
		if (inicio == fim)
			return;

		//divisão
		mergeSort(array, inicio, meio);
		mergeSort(array, meio + 1, fim);
		
		//combinação
		merge(array, inicio, meio, fim);
	}

	private static void merge(String[] array, int inicio, int meio, int fim) {
		String[] copia = new String[fim + 1];
		int i = inicio; // indice esqueda
		int j = meio + 1; // indice direita
		int k = inicio; // indice vetor original

		// Copia o vetor
		for (int p = 0; p < fim + 1; p++) {
			copia[p] = array[p];
		}

		while (i <= meio && j <= fim) {
			if (copia[i].compareTo(copia[j]) < 0)
				array[k++] = copia[i++];
			else
				array[k++] = copia[j++];
		}

		while (j <= fim) { // caso de sobrar somente a direita
			array[k++] = copia[j++];
		}

		while (i <= meio) { //caso sobrar somente a esqueda
			array[k++] = copia[i++];
		}
	}

	private static void print(String[] palavras) {
		for(int i=0; i<palavras.length; i++) {
			System.out.print(palavras[i] + " ");
		}
		
	}

}
