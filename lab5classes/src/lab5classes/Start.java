package lab5classes;

public  class  Start {
	
int number_rise;
String name_rise;
String plane_type;
int ticket_cost;
int route_length;



public Start( int number_rise, String name_rise,String plane_type)
{
	this.number_rise=number_rise;
	this.name_rise=name_rise;
	this.plane_type=plane_type;
}

public int get_number_rise()
{
	return number_rise;
}

public String get_name_rise()
{
	return name_rise;
}

public String get_plane_type()
{
	return plane_type;
}
public void print()
{
	System.out.println(name_rise);
}

public Start(Start other)
{
	this(other.get_number_rise(), other.get_name_rise(), other.get_plane_type() );
}
	
	public static void main(String[] args) {
		Start original = new Start(50,"Kiev Moscow", "boing");
		Start clone = new Start(original);
	original.print();

	}

}
