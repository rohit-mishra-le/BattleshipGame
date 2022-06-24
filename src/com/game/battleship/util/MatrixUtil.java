package com.game.battleship.util;

public class MatrixUtil {
	public static void reverse(String[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		for(int i=0; i<m/2; i++) 
			for(int j=0; j<n; j++) 
				swap(arr[i], j, arr[m-1-i], n-1-j);
			if(m%2 == 1) {
				String[] mid = arr[m/2];
				for(int j=0; j<n/2; j++)
					swap(mid, j, mid, n-1-j);
			}	
	}
	static void swap(String[] a, int i, String[] b, int j) {
		String tmp = a[i];
		a[i] = b[j];
		b[j] = tmp;
	}
}
