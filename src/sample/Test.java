package sample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB b = new ClassB();
		b.b();
		   System.out.println(b.x); 
		 
		   ClassA a = new ClassA();
		   a.a();
		   System.out.println(a.x);
		 
		   ClassA a2 = new ClassB();
		   a2.a();
		   
		   System.out.println(a2.x);

	}

}
