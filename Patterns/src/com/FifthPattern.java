package com;

/*
 * Pattern is 
 * 1 2 3 4 5 6 
 *  2 3 4 5 6 
 *   3 4 5 6 
 *    4 5 6  
 *     5 6 
 *      6 
 *     5 6   
 *    4 5 6 
 *   3 4 5 6 
 *  2 3 4 5 6 
 * 1 2 3 4 5 6 
 *      
 *   
 * 
 */
public class FifthPattern {

	public static void main(String[] args) {
		int n =6;
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				if(i==1){
					System.out.print(j+" ");
				}
				else if(j<i) {
					System.out.print(" ");
				}
				
				else 
					System.out.print(j+" ");
				
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n-1) {
					System.out.print(j+" ");
				}else if(j<n-i)
					System.out.print(" ");
				else if(j>=n-i)
					System.out.print(j+" ");
				
				
			}
			System.out.println();
		}

	}

}
