package pack2;

import pack1.Prot;

public class Demo {
	 void Print2(int d)
	{
		System.out.println(d);
	}
	public static void main (String[] args)
	{
		Prot ex4 = new Prot();
		System.out.println("друго пакет не наследник");
Demo ex3 = new Demo();
	ex3.Print2(ex4.n_pub)	;
	
	}
}
