package application;

public class graph_diagram {
	
	public static int day (int month)
	{
		int day=0;
		int mon = 10;
	      

		if (month ==mon || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
		{
		day=31;	
		}
		if (month ==4 || month==6 || month==9 || month==11 )
		{
			day=30;
		}
		if (month ==2)
		{
		day=28;	
		}
		return day;
	}
	
	public static int[][] Main(int month, int year)
	{
		int day=0;
      

		day = day(month);
		
        int i4[][] = new int[day][17];

		
		for(int i=0;i<day;i++)
		{
			int chislo2[] = new  int[6];
            

            chislo2=processing.Main(Integer.toString(i), Integer.toString(month), Integer.toString(year));
            int i3[][] = new int[2][17];
             i3=processing.numbers12(Integer.toString(day), Integer.toString(month), Integer.toString(year), chislo2);
             i4[i]=i3[0];
		}
		return i4;
	}

}
