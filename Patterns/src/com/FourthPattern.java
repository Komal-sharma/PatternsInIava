package com;
/*
 * Pattern is
 * 1 2 3 4
 * 1     4
 * 1     4
 * 1 2 3 4
 */
public class FourthPattern {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				 if (i == 1 || i == n)
	                    System.out.print(" "+j);
	               else if (j == 1 || j == n)
	                    System.out.print(" "+j);
	              else
	                    System.out.print("  ");
			}
			System.out.println();
		}
	}

}
