package SampleCalc;

import sample.Multiply;

public class Division {
	public void division() {
		int a=50;
		int b=10;
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition();
		add.addition();
		Subraction sub = new Subraction();
		sub.subraction();
		Multiply mul = new Multiply();
		mul.multiply();
		Division div = new Division();
		div.division();
	}

}
