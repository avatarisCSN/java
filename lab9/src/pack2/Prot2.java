package pack2;

import pack1.Prot;

public class Prot2 extends Prot {
	static void Print2(int d)
	{
		System.out.println(d);
	}
	public static void main (String[] args)
	{
		Prot2 say=new Prot2();
		System.out.println("другой пакет наследник");
System.out.println(say.n_pub);
	}
}
