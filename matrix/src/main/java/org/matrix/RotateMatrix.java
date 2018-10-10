package org.matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] matix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		printMatrix(matix, 4, 4);

		int[][] m = rotateArray(matix, 4, 4);

	}

	private static int[][] rotateArray(int[][] m, int row, int col) {
		int startRow = 0;
		int startCol=0;
		int endRow=row-1;
		int endCol = col-1;
		int prev,curr;
		
		while (startRow <endRow && startCol < endCol) {

			// shift first row , fix=startRow
			prev= m[startRow][startCol];
			for (int i = startCol; i < endCol; i++) {				
				curr =m[startRow][i+1];
				m[startRow][i + 1] = prev;
				prev= curr;
			}			
			System.out.println("after shifting row");
			printMatrix(m, 4, 4);
						
			//shift last column fix=endCol
			for (int i = startRow; i <endRow; i++) {				
				curr =m[i+1][endCol];
				m[i+1][endCol] = prev;
				prev= curr;
			}
			System.out.println("after shifting column");
			printMatrix(m, 4, 4);
						
			//shift last row , fix= endRow
			for (int i = endCol; i > startCol; i--) {				
				curr =m[endRow][i-1];
				m[endRow][i-1] = prev;
				prev= curr;
			}
			System.out.println("after shifting last row");
			printMatrix(m, 4, 4);			

			//shift fist column upward fix = startCol
			for (int r = endRow; r > startRow;r--) {				
				curr =m[r-1][startCol];
				m[r-1][startCol] = prev;
				prev= curr;
			}
			System.out.println("after shifting first column");
			printMatrix(m, 4, 4);
			
			startRow++;
			startCol++;
			endCol--;
			endRow--;

		}
		return m;
	}

	public static void printMatrix(int[][] m, int r, int c) {
		String str = "|\t";
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				str += m[i][j] + "\t";
			}
			System.out.println(str + "|");
			str = "|\t";
		}
	}

}
