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
		
		insertionSort(palavras);
		
		print(palavras);
		
		sc.close();		

	}

	private static void insertionSort(String[] palavras) {
		for(int i=0; i<palavras.length; i++) {
			int j = i;
			while(j>0 && palavras[j-1].compareTo(palavras[j])>0) {
				swap(palavras, j, j-1);
				j= j-1;
			}
		}
		
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
