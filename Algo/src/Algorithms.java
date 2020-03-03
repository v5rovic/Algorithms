import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Algorithms  {

	
	// counting the repetition of the letter of a given String
	
	public static HashMap<Character, Integer> charOccurence(String s){
		HashMap<Character, Integer> mapa = new HashMap<Character, Integer>();
		for (Character ch : s.toCharArray()) {
			int i = 1;
			if(!mapa.containsKey(ch)) {
				mapa.put(ch, i);
			}else {			
				mapa.replace(ch, mapa.get(ch)+i);
			}
		}
		return mapa;
	}
	
	// Fibonacci Sequence
	
	public static ArrayList<Integer> getFibonachi(int l) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(1);
		for (int i = 1; i < l-1; i++) {
			int s = lista.get(i-1) + lista.get(i);
			lista.add(s);
		}
		return lista;
	}
	
	
	// wave text format
	
	public static String mockText(String string) {
		
		
		char[] ch = string.toCharArray(); 
		String str = "";
		for (int i = 0; i < ch.length; i++) {			
			if(i%2 == 0) {	
			str += Character.toLowerCase(ch[i]);
			}else {				
			str += Character.toUpperCase(ch[i]);
			}
		}
		return str;
			
	}
	
	// merging strings by alphabetic order
	
	public static String getMerged(String str1, String str2, String str3) {
		
		Map<String, Integer> mapa = new TreeMap<>();
		int n=1;
		mapa.put(str1, n);
		mapa.put(str2, n);
		mapa.put(str3, n);
		String s ="";
		for(Entry<String, Integer> entry : mapa.entrySet()) {
		    s += entry.getKey();
			}
		
		return s;
	}
	
	// formating matrix [n][n] to fill diagonally
	
	public static int[][] matrix(int n){
		int matrix[][] = new int[n][n];
		
		matrix[0][0] = 1;
		for (int i = 1; i < n; i++) {
				matrix[0][i]= matrix[0][i-1] + i + 1;
		}
		for (int i = 1; i < n; i++) {
				matrix[i][n-1]= matrix[i-1][n-1] + n - i;
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n-1; j++) {
				matrix[i][j]= matrix[i-1][j+1] - 1;	
			}
		}
		
		return matrix;
	}
	
	
	// printing matrix filled by above algorithm
	
	private static void matrixPrint(int n) {
		int [][] matrica = matrix(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrica[i][j]+"\t");
			}
		System.out.println("\n");
		}
	}	
	
	
		
	public static void main(String[] args) {
		
		System.out.println(charOccurence("Vladimir Petrovic"));
		System.out.println("\n");
		System.out.println(getFibonachi(10));
		System.out.println("\n");
		System.out.println(getMerged("aab", "aba", "akc"));
		System.out.println("\n");
		System.out.println(mockText("wavey text format!"));
		System.out.println("\n");		
		matrixPrint(10);
		
		
		
		
		
  }

	
	

	
	
}
