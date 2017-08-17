import java.util.Arrays;
import java.util.Random;
	

public class Insertion{

	public static int[] criaVetor(int n){
		int []vetor = new int[n];
		Random cria = new Random();
		for(int i=0; i<n; i++){
			vetor[i] = cria.nextInt(100);
	    }
		return vetor;
	}
	
	private static void insertionSort(int[] vetor){
		for(int i=1; i<vetor.length; i++){
			
			int escolhido = vetor[i];
			int j=i-1;
			
			while ((j>=0)&&(vetor[j]> escolhido)){
				vetor[j+1] = vetor[j];
				j--;
			}
			vetor[j+1] = escolhido;
		}
	}
	
	public static void main(String[] args){
		int []vetor = criaVetor(10);
		insertionSort(vetor);
		System.out.println(Arrays.toString(vetor));
		
	}
}	