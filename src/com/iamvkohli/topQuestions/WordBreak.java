package com.iamvkohli.topQuestions;

import java.util.HashSet;

public class WordBreak {

	// Dynamic Programming SOLUTION
	public static boolean isBreakable(HashSet dictionary, String word) {

		int size = word.length();
		
		if(size == 0) {
			return true;
		}
		
		boolean[] aux = new boolean[size+1];
		
		for(int i=1; i<=size; i++) {
			
			String prefix = word.substring(0, i);
			System.out.println("Prefix "+ prefix);
			
			if( aux[i]==false && dictionary.contains(prefix) ){
				aux[i] = true;
				System.out.println("FOUND prefix "+ prefix);
			}
			
			if( aux[i] == true ) {
				
				//End of String , no further processing required
				if(i == size) {
					return true;
				}
				
				
				for(int j=i+1  ; j<=size; j++) {
					
					String sub = word.substring(i, j);
					System.out.println("SUB "+ sub);
					
					if( aux[j]==false && dictionary.contains(sub) ){
						aux[j] = true;
						System.out.println("FOUND string "+ sub);
					}
					
					if( j==size && aux[j]==true)
						return true;
				}
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		HashSet<String> dictionary = new HashSet<String>();
		dictionary.add("v");
//		dictionary.add("kohli");
		dictionary.add("ko");
		dictionary.add("hli");
		
		System.out.println( isBreakable( dictionary, "vkohli") );
		
	}
}
