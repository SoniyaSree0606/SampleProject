package SampleCalc;

public class Calculation {
	public int add() {
		int a = 50;
		int b = 50;
		int c = a+b;
		System.out.println(c);
		return c;
	}
	public void addition() {
		int b = 50;
		int c = add()+b;
		System.out.println(c);
			}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to my home";
		char[] s1 = s.toCharArray();
		for(int i =0;i<=s.length()-1;i++) {
		System.out.println(s1[i]);
		
		}
		System.out.println(s1.length);
		System.out.println(s.length());
		Calculation cal = new Calculation();	
		cal.add();
		cal.addition();
		
		//cal.sub();
	}

}
