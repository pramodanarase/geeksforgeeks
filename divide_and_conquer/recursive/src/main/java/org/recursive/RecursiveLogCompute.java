package org.recursive;

public class RecursiveLogCompute {


	
	public static void main(String[] args) {
		int num = 32;

		int res = logOfBase2(num);
		
		System.out.println(res);
	}

	private static int logOfBase2(int i) {

		if (i == 0 || i == 1) return 0;		
		return 1 + logOfBase2(i / 2);
	}

}
