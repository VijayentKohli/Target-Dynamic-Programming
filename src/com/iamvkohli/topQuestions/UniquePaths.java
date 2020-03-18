//package com.iamvkohli.topQuestions;
//
//import java.util.Arrays;
//import java.util.HashMap;
//
//public class UniquePaths {
//
//
//
//    
//    public static void print2D(int[][] arr, int m , int n){
//        System.out.println(); 
//    	for(int row=0; row<n; row++){
//            for(int col=0;col<m; col++){
//               System.out.print(arr[row][col]+" - ");
//            }
//           System.out.println();  
//        }
//    }
//    
//    public static int uniquePaths(int m, int n) {
//        int[][] dp = new int[n][m];
//        
//        
//        System.out.println("Columns="+m+"\tRows="+n);  
////        print2D(dp, m, n);
//        
//        
//        Arrays.fill(dp[0], 1);
////        print2D(dp, m, n);
//
//        for(int i=1;i<n;i++){
//            dp[i][0]=1;
//        }
//        print2D(dp, m, n);
//        
//        for(int row=1; row<n; row++){
//            for(int col=1;col<m; col++){
//                dp[row][col] = (dp[row-1][col]+dp[row][col-1]);
//                print2D(dp, m, n);
//            }
//        }
//        
//        return dp[n-1][m-1];
//    }
//    
//    public static void main(String[] args) {
//		uniquePaths(7,3);
//		
//		HashMap<Integer, Integer> hm = new HashMap<>();
//		hm.
//	}
//}