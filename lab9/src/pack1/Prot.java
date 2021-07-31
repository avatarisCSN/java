package pack1;

public class Prot {
	int n=1;
	private int n_pri=2;
	protected int n_pro=3;
	public  int n_pub=4;
public void Print(int c)
{
	System.out.println(c);
}
public static void main (String[] args)
{
Prot ex1 = new Prot();
ex1.Print(ex1.n);
ex1.Print(ex1.n_pub);
ex1.Print(ex1.n_pro);
ex1.Print(ex1.n_pri);
}
}
