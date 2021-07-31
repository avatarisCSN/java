package orderBuilderSC2;

public class Main {

	
	public static void main(String[] args)
	{
		int min_current=50;
		int gaz_current = 0;
		 int income_min=0;
		 int workers_min=12;
		int workers_gaz;
		
		int minute;
		int second;
		 int CC_status=0;
		
		int price_worker=50;
		int time_worker=12;
		int worker_total=12;
		
		int price_barrack=150;
		int time_barrack=46;
		int barrack=0;
		
		int price_supply=100;
		int time_supply=21;
		
		int price_marine=50;
		int time_marine=18;
		int marine=0;
		
		int supply_current=12;
		int supply_limit=15;
		
		int time_worker_start;
		int time_worker_end=-1;
		
		
	for ( int sec = 0; sec<500; sec++)
	{
		income_min = 60*worker_total;
		min_current=min_current+income_min/60;
		supply_current=worker_total+marine;
		System.out.println(sec);
		
		if(time_worker_end==sec)
	    {
	    	System.out.println("3+3");
	    worker_total =worker_total+1;
	    income_min = 60*worker_total;
		supply_current=worker_total+marine;
	    }
		
	    if(CC_status==0 && min_current >=50 && time_worker_end<=sec && supply_current<supply_limit)
	    {
	    	System.out.println("2+2");
	    	
	    	min_current=min_current-50;
	    	 time_worker_start = sec;
	    	 time_worker_end = sec+time_worker;
	    	  }
	    
	    
	    
	    
	    if(worker_total==15)
		{
		System.out.println(worker_total+" "+income_min+" "+min_current+" "+sec);
		System.exit(0);
		}
	    
		
	}
	
	}
}
	
	


