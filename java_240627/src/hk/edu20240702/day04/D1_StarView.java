package hk.edu20240702.day04;

import java.util.Iterator;

public class D1_StarView {
	public static void main(String[] args) {
		/*
		0 ★			0+1=1
		1 ★★		1+1=2
		2 ★★★		2+1=3		
		3 ★★★★
		4 ★★★★★
		
		
		*/
		
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		/* 1. 삼각형
		★
		★★★
		★★★★★
		★★★★★★★
		
		0=1	
		1=3	(1*2)+1
		2=5 (2*2)+1
		
		
		*/
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i*2)+1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		/* 2. 오른쪽 삼각형
		    *
		   **
		  ***
		 ****
	    *****
		
		0 = 공백 4 * 1
		1 = 공백 3 * 2
		2 = 공백 2 * 3
		
		n = 공백 (5-(n+1)) * (n+1)
		
		*/
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-(i+1); j++) {	//공백
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {	// *
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* 3. 정삼각형
		    *
		   ***
		  *****
		 *******
		*********
	   
	   0 = 공백 4 * 1
	   1 = 공백 3 * 3
	   2 = 공백 2 * 5
	   
	   공백 (5-(i+1))
	   *   (1+(i*2))
		*/
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-(i+1); j++) {	//공백
				System.out.print(" ");
			}
			for (int j = 0; j < 1+(i*2); j++) {	// *
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*  4.아래방향 정삼각형
	  	★★★★★★★★★            공백출력: 0 1 2 3 4     0 + i*1 = i
	  	☆★★★★★★★             별출력 :  9 7 5 3 1     9 + i*-2 = 9-(i*2) 
	  	☆☆★★★★★ 
	  	☆☆☆★★★
	  	☆☆☆☆★
	 */
	 System.out.println("=====================");
	 int num2=5;
	 for (int i = 0; i < num2; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print("☆");
		}
		for (int j = 0; j < (num2*2-1)-(i*2); j++) {
			System.out.print("★");
		}
		System.out.println();
	}
	 
	 
	 /* 5.아래방향 직삼각형
	  	★★★★★             5-i
	  	★★★★
	  	★★★ 
	  	★★
	  	★
	 */
	 System.out.println("=====================");
	 for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5-i; j++) {
			System.out.print("★");
		}
		System.out.println();
	}
	 
	 /* 6.마름모
  			☆☆☆☆★                   
	  		☆☆☆★★★
	  		☆☆★★★★★                 
	  		☆★★★★★★★
	  		★★★★★★★★★
	  		☆★★★★★★★
	  		☆☆★★★★★ 
	  		☆☆☆★★★
	  		☆☆☆☆★
	  */
	}
}
