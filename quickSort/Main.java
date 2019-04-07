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
		
		quickSort(palavras, 0, palavras.length-1);

		print(palavras);
		
		sc.close();		

	}

	private static void quickSort(String[] vetor, int inicio, int fim) {
		
		int pivo = particao(vetor, inicio, fim);
		
		if(inicio < pivo-1) quickSort(vetor, inicio, pivo-1);
		if(fim > pivo) quickSort(vetor, pivo, fim);		
}

	private static int particao(String[] vetor, int inicio, int fim) {
	
		int esquerda = inicio;
		int direita = fim;
	
		String pivo = vetor[(inicio+fim)/2];
	
		while(esquerda<=direita) {
			while(pivo.compareTo(vetor[esquerda])>0)
				esquerda++;
		while(pivo.compareTo(vetor[direita]) < 0)
				direita--;
			if(esquerda<=direita) {
			swap(vetor, esquerda++, direita--);
		}	
	}
	
	return esquerda;
}

	private static void print(String[] palavras) {
		for(int i=0; i<palavras.length; i++) {
			System.out.print(palavras[i] + " ");
		}
		
	}

	private static void swap(String[] string, int i, int j) {
		String aux;
		
		aux= string[i];
		string[i] = string[j];
		string[j] = aux;	
	}
}
