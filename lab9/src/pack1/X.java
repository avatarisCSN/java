package pack1;

public class X {
	public static void main (String[] args)
	{
Prot ex1 = new Prot();
System.out.println("доступ с неподкласса в том пакете");
ex1.Print(ex1.n);
ex1.Print(ex1.n_pub);
ex1.Print(ex1.n_pro);

	}
}
