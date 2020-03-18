package com.iamvkohli.topQuestions;

import java.util.Arrays;

public class CoinChange {

	public static int solution(int[] denominations, int index, int sum) {

		if (sum <= 0) {
			return  1;
		}

		int[] Aux = new int[sum + 1];

		Arrays.fill(Aux, 0);
		Aux[0] =  1;

		for (int i = 0; i < index; i++) {
			for (int j = denominations[i]; j <= sum; j++) {
				System.out.println(
						"i=" + i + "  j=" + j + "   Aux[i]=" + Aux[i] + "   denomination[i]=" + denominations[i]);
				Aux[j] += Aux[j - denominations[i]];
				System.out.println("Aux["+j+"]="+ Aux[j]);
			}
		}

		return Aux[sum];

	}
	
	static long countWays(int S[], int m, int n) 
    { 
        //Time complexity of this function: O(mn) 
        //Space Complexity of this function: O(n) 
  
        // table[i] will be storing the number of solutions 
        // for value i. We need n+1 rows as the table is 
        // constructed in bottom up manner using the base 
        // case (n = 0) 
        long[] table = new long[n+1]; 
  
        // Initialize all table values as 0 
        Arrays.fill(table, 0);   //O(n) 
  
        // Base case (If given value is 0) 
        table[0] = 1; 
  
        // Pick all coins one by one and update the table[] 
        // values after the index greater than or equal to 
        // the value of the picked coin 
        for (int i=0; i<m; i++) 
            for (int j=S[i]; j<=n; j++) 
                table[j] += table[j-S[i]]; 
  
        return table[n]; 
    } 

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3 };
		int m = arr.length;
		int n = 4;
//		System.out.println(solution(arr, m, n));
//		System.out.println(countWays(arr, m, n));
		
		String str = "VKOHLI";
		System.out.println(str.substring(0, 1));
		System.out.println(str.substring(1, str.length()));
				
	}
}
