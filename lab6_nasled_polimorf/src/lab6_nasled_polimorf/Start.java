package lab6_nasled_polimorf;

public class Start {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog( "What's your name of company?");
        String info = JOptionPane.showInputDialog( "What's your information of company and plus?");
        Trevel companyDiligance = new companyDiligance(name, info);
        String name2 = JOptionPane.showInputDialog( "What's your name of company?");
        String info2 = JOptionPane.showInputDialog( "What's your information of company and plus?");
        Trevel compEnti = new companyDiligance(name2,info2);
        System.out.println("Company name - "+companyDiligance.nameOfCompany);
        System.out.println("Company Information- "+info);
        System.out.println();
        System.out.println("Company name - "+compEnti.nameOfCompany);
        System.out.println("Company Information- "+info2);
        System.exit(0);
    }

	
	public class Firma
	{
		String Firma_name;
		int year_begin;
		int number_countries;
		String reklama;
		mass [String] name countries;
		
		
		public Firma (Firma_name)
		void show()
		{
			System.out.println(Firma_name+year_begin+number_countries);
		}
	}
	public class Country extends Firma
	{
		String Country_name;
		int min_price;
		int max_price;
	}

	public class Med extends Firma
	{
		String Med_name;
		int min_price;
		int max_price;
	}
void print()
{
	System.out.println();
}

