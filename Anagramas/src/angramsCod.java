import java.util.Scanner;

import javax.swing.JOptionPane;

public class angramsCod {
	public static void main(String[] args) {
		String Anagram = Anagram_Word();
		char vetor[];
		
	}
	public static String Anagram_Word(){
		String word = "";
		while(word.length() <= 2) {
			word = JOptionPane.showInputDialog(null,"Anagrama", JOptionPane.INFORMATION_MESSAGE);
		}
		return word;
	}
	private static void Show(char[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + "");
		}
		System.out.println("");
	}
	
	private static void Calc_Anagram(char vetor[], int A) {
		int i;
		if(A == vetor.length -1) {
			Show(vetor);
		}
		else {
			Calc_Anagram(vetor, A + 1);
		}
		i = A +1;
		while(i < vetor.length) {
			Change_Posi(vetor, A, i);
			Calc_Anagram(vetor, A + 1);
			Change_Posi(vetor, A, i);
			i = i +1;			
		}
	}
	private static void Change_Posi(char[] vetor, int a,int i) {
		char auxi;
		auxi = vetor[i];
		vetor[i] = vetor[a];
		vetor[a] = auxi;
	}
}
