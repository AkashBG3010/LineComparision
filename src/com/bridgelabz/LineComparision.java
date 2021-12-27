package com.bridgelabz;

public class LineComparision {

	static class Pair {
		int first, second;
		public Pair(int first, int second)
		{
			this.first = first;
			this.second = second;
		}
	}
	static void lineFromPoints(Pair P, Pair Q)
	{
		int a = Q.second - P.second;
		int b = P.first - Q.first;
		int c = a * (P.first) + b * (P.second);
		if (b < 0) {
			System.out.println(
				"The line passing through points P and Q is: "
				+ a + "x - " + b + "y = " + c);
		}
		else {
			System.out.println(
				"The line passing through points P and Q is: "
				+ a + "x + " + b + "y = " + c);
		}
	}
	public static void main(String[] args)
	{
		Pair P = new Pair(3, 2);
		Pair Q = new Pair(2, 6);
		lineFromPoints(P, Q);
	}
}