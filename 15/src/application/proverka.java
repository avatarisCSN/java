package application;

public class proverka {
	
	
	public static boolean check(int[][] info)
	{
		boolean result=false;
		for(int i=0;  i < info.length-1; i++)
	 {
		if (info[i][1]!=i)	break;		
		if (i==info.length-1)
		{
		     result=true;
		}
     }
	return result;
    }
	
	public static int clickPos(double x, double y)
	{
		int pos=0;
		if(0<x && x<99)
		{
			if(0<y && y<99)
			{
				pos= 0;
			}
			if(100<y && y<199)
			{
				pos=3;
			}
			if(200<y && y<299)
			{
				pos=6;
			}
		}
		if(100<x && x<199)
		{
			if(0<y && y<99)
			{
				pos=1;
			}
			if(100<y && y<199)
			{
				pos=4;
			}
			if(200<y && y<299)
			{
				pos=7;
			}	
		}
		if(200<x && x<299)
		{
			if(0<y && y<99)
			{
				pos=2;
			}
			if(100<y && y<199)
			{
				pos=5;
			}
			if(200<y && y<299)
			{
				pos=8;
			}	
		}
		
		return pos;
	}
	
	public static int[] XY(int number)
	{
		int[] result = new int[2];
		switch (number)
		{
		case 0:
			result[0]=0;
			result[1]=0;
			break;
		case 1:
			result[0]=1;
			result[1]=0;
			break;
		case 2:
			result[0]=2;
			result[1]=0;
			break;
		case 3:
			result[0]=0;
			result[1]=1;
			break;
		case 4:
			result[0]=1;
			result[1]=1;
			break;
		case 5:
			result[0]=2;
			result[1]=1;
			break;
		case 6:
			result[0]=0;
			result[1]=2;
			break;
		case 7:
			result[0]=1;
			result[1]=2;
			break;
		case 8:
			result[0]=2;
			result[1]=2;
			break;
		}
		return result;
	}
	
	public static int[] randomizer()
   {
		  int [] randomN =new int[9];
		    
			int chislo;
			for(int i=9;i>0;i--)
			{
				
			do
			 {
				double rnd = Math.random();
			 chislo = (int)Math.round(rnd*10);
			// System.out.println(chislo);
			 } while(chislo==0 ||
					 chislo==10 ||
					 chislo== randomN[0] ||
					 chislo== randomN[1] ||
					 chislo== randomN[2] ||
					 chislo== randomN[3] ||
					 chislo== randomN[4] ||
					 chislo== randomN[5] ||
					 chislo== randomN[6] ||
					 chislo== randomN[7] 
					 );
				
			 System.out.println(chislo);
			 randomN[9-i]=chislo;
		    }
			return randomN;
   }
	
	
}
