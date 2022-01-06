
public class MAIN {
	
	
	public static void main(String[] args) {
		
		double nach_res= 40000 ;
		double nach_rashod=0;
		 int kolvo_poley;
		 
		double bonus_koef=1.25; 
		
		double oaz_koef=1.1; ///1,5 1,1
		
		
		int tier_now=0;
		int a=0;
		int b=0;
		
		
		
		double vrem_nakop;
		double vrem_summ=0;
		
		
		double stoimost_sloya;
	    double CVR_pola[] = {2, 3, 4, 6, 7, 11, 17, 20, 30, 45, 55, 80, 95, 120, 140, 165, 200, 300, 300, 400, 500};
for (a=0;a<21;a++)
{
	CVR_pola[a]=CVR_pola[a]*3;//изменил
}
		double sum_CVR;
		double stoimost_pola[]= {250, 415, 695, 1165, 1945, 3250, 5420, 9055,15120, 25260, 42184, 70447, 117647, 196471, 328107, 547938, 915058, 1528146, 2552005, 4261848};
		
		  nach_res= nach_res-nach_rashod;
		 
		  sum_CVR= 2000+ CVR_pola[0]*7*bonus_koef*oaz_koef;///15 7
		  
		 
			 
		
		 
		 
		 
		  
		
		 
	for ( b=0; b < 11	; b++ )
	{ 
		if (b==6)
		{
			oaz_koef=1.1;///1,75   1,1
			sum_CVR=sum_CVR*1;///sum_CVR=sum_CVR*1.09375; 1
		}
		if (b==7)
		{
		
			
			nach_res=nach_res+17500;
		
		}
		if (b==9)
		{
		
			oaz_koef=1.6;/////2,5 1,6
			sum_CVR=sum_CVR*1.45;////sum_CVR=sum_CVR*1.428571429; 1,45

				
		}
		 if (b==10)
			{
				nach_res=nach_res+100000;
			

					
			}
		 
		 if (b==12)
			{
				nach_res=100000;
			}
		double  kolvo_poley2 =  nach_res/stoimost_pola[b];
		 kolvo_poley =(int)kolvo_poley2;
		 double ostatok= kolvo_poley2- kolvo_poley;
		
		

		
		 if (kolvo_poley >= 7)//7 15
		 {
			  stoimost_sloya = stoimost_pola[b]*7;//7 15
			  
			  nach_res = nach_res - stoimost_sloya;
			  sum_CVR= sum_CVR+  (CVR_pola[b+1]*7*bonus_koef*oaz_koef);//7 15
			 
		 }
		 else
		 {
			 
			 sum_CVR=sum_CVR+kolvo_poley*CVR_pola[b+1]*bonus_koef*oaz_koef;
		while ( kolvo_poley < 7) //7 15
		{
			
			
			
			nach_res=0;
			vrem_summ=vrem_summ-ostatok;
			ostatok=0;
			
		  vrem_nakop = stoimost_pola[b]/sum_CVR;
		  System.out.println(vrem_nakop);
		  vrem_summ = vrem_summ+vrem_nakop;
		  double cvr_stage = CVR_pola[b+1]*bonus_koef*oaz_koef;
		  sum_CVR=sum_CVR+CVR_pola[b+1]*bonus_koef*oaz_koef;
			
		  System.out.println(sum_CVR);
		  System.out.println(cvr_stage+" "+CVR_pola[b+1]);
		
		 kolvo_poley = kolvo_poley+1;
		  
		}
		kolvo_poley=0;
		 }
		
	}
	System.out.println(vrem_summ);
	System.out.println(oaz_koef);
	System.out.println(CVR_pola[b]);
	}
}

