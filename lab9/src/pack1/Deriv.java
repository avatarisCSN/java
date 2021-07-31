package pack1;

public class Deriv extends Prot {
	public static void main (String[] args)
	{
Prot ex1 = new Prot();
System.out.println("доступ с подскласса в том пакете");
ex1.Print(ex1.n);
ex1.Print(ex1.n_pub);
ex1.Print(ex1.n_pro);

	}
}
