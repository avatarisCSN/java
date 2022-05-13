package application;

import java.util.StringTokenizer;

public class proces {
	
	
	
	public static int[][] TxtToInt(String str, int x )
	{
		// массив  для вывода массива коефициентов системы
		 int[][] resultInt = new int[x][x+1];
	// массив  для системы уравнений
		String[] IncToStr= new String[x];
		// массив для одного уравнения
		String[] Splitted= new String[x+1];
		// обработка сложенной строки из всех уравнений (разделение на отдельные строки)
		
		StringTokenizer tokenizer = new StringTokenizer(str," ");
		   int c=0;
		   while (tokenizer.hasMoreTokens())
		   {
			   
			   
		      String token = tokenizer.nextToken();
		      IncToStr[c] = token; 
		      System.out.println(token);
		      c++;
		       
		   }
		   
		// обработка входной строки
		   for(int countToStr=0; countToStr<x; countToStr++)
		   {
			// обработка входной строки в строчный массив(разделение  коеф перед переменными в разные ячейки списка )
			   StringTokenizer tokenizer2 = new StringTokenizer(IncToStr[countToStr],"+-=");
			   int c2=0;
			   while (tokenizer2.hasMoreTokens())
			   {
				   
				 //  System.out.println(x);
			      String token2 = tokenizer2.nextToken();
			      Splitted[c2] = token2; 
			      System.out.println(token2+"hello");
			      c2++;
			       
			   }   
			   // перевод строчного массива в инт массив
			   
			// создаем список строк
			   String[] result2 = new String[x+1];
			   
				for (int countToInt=0; countToInt < x+1; countToInt++ )
				{
				// создаем два буферных массива символов
				char[] buff = Splitted[countToInt].toCharArray();
				char[] buff2 = new char[buff.length];
				
				
				
				// создание переменных для оператора while
				
				int lengthUP = buff.length;
				int lengthDN = 0;
				// проверка на число 
				while(lengthUP>0)
				{
					lengthUP--;
					lengthDN++;
					
					 boolean tru = Character.isDigit(buff[lengthDN-1]);
					
					 //присвоение
					 if (tru)
					 {
						buff2[lengthDN-1] = buff[lengthDN-1];
						
						if(result2[countToInt] == null)
						{
						result2[countToInt]=Character.toString(buff2[lengthDN-1]); 
						}
						else
						{
						
						result2[countToInt]+=Character.toString(buff2[lengthDN-1]); 
						}
					 }		
				}
				}
				
				for (int j=0; j<x+1; j++)
				{
					resultInt[countToStr][j]=Integer.parseInt(result2[j]);
					System.out.println(resultInt[countToStr][j]);
					
				}


			   
			   
				
		   }	
			return resultInt;
	}
	
	public static double[][] IntToDouble(int[][] mass, int x)
	{
		
		 double[][] result = new double[x][x+1];
		 // заполняю значениями
		 for (int i=0; i<x; i++)
		 {
			 
			 for(int j=0; j<x+1; j++)
			 {
				 result[i][j]=mass[i][j];
			 }
		 }	
		 return result;
	}
	
	
	public static double[] methodGaussa (int[][] mass, int x)
	{
		double[] result = new double[x];
		 double[][] pramoyHod = new double[x][x+1];
		 // заполняю значениями
		 for (int i=0; i<x; i++)
		 {
			 
			 for(int j=0; j<x+1; j++)
			 {
				 pramoyHod[i][j]=mass[i][j];
			 }
		 }	 
		 
		 // прямой ход
		 for (int JJ=0; JJ<x-1; JJ++)
		 {
			    
			 
		 for ( int I=JJ+1; I<x; I++)
		   {
			 double bb=pramoyHod[I][JJ];
			 double nn=pramoyHod[JJ][JJ];
			 double koef=bb/nn;
			 System.out.println(" koef="+koef);
			 for(int J=JJ	; J<x+1; J++)
			 {
				 
				pramoyHod[I][J]= pramoyHod[I][J]-pramoyHod[JJ][J]*koef; 
				System.out.print(I+" "+J+" "+pramoyHod[I][J]+"   " );
			 }
		   }
		 
		 
		 } 
		 System.out.println("result");
		 
		 
		 for (int i=0; i<x; i++)
		 {
			 System.out.println(" ");
			 for(int j=0; j<x+1; j++)
			 {
				 System.out.print(pramoyHod[i][j]+" ");
			 }
		 }	 
		 
		 
		 
		 // обратный ход
		 for(int i=x-1; i>-1; i--)
		 {
			 double d=0;
			 for (int j=i+1; j<x; j++)
			 {
				 double s=result[j]*pramoyHod[i][j];
				 d=d+s;
			 }
			 result[i]=(pramoyHod[i][x]-d)/pramoyHod[i][i];
		 }
		 System.out.println(); 
		for(int i=0; i<x;i++)
		{
			System.out.println(result[i]);
		}
		return result;
	}
	public static double[] methodKramera (int [][] mass, int x)
	{
	double[] result = new double[x];
	double[][] matrix = new double[x][x+1];
	matrix=IntToDouble(mass, x);
	
	 double det =  determinant(matrix);
	 double detX1 =  determinantX1(matrix);
	 double detX2 =  determinantX2(matrix);
	 double detX3 =  determinantX3(matrix);
	 
	 if (det != 0)
		{
			double X1 = detX1/det;
			double X2 = detX2/det;
			double X3 = detX3/det;
			result[0]=X1;
			result[1]=X2;
			result[2]=X3;
			System.out.println(result[0]+" "+result[1]+" "+result[2]+" ");
		}
		else
			System.out.println("нет решения");

		
		
	
	
	return result;
	}
	
	public static double determinant(double coefMatrix[][])
	{
		double a11 = coefMatrix[0][0];
		double a12 = coefMatrix[0][1];
		double a13 = coefMatrix[0][2];
		double a21 = coefMatrix[1][0];
		double a22 = coefMatrix[1][1];
		double a23 = coefMatrix[1][2];
		double a31 = coefMatrix[2][0];
		double a32 = coefMatrix[2][1];
		double a33 = coefMatrix[2][2];

		return (a11 * a22 * a33) + (a12 * a23 * a31) + (a13 * a21 * a32) -
			(a13 * a22 * a31) - (a11 * a23 * a32) - (a12 * a21 * a33);
	}
	
	
	
	public static double determinantX1(double coefMatrix[][] )
	{
		double a12 = coefMatrix[0][1];
		double a13 = coefMatrix[0][2];
		double a22 = coefMatrix[1][1];
		double a23 = coefMatrix[1][2];
		double a32 = coefMatrix[2][1];
		double a33 = coefMatrix[2][2];
		double c1 = coefMatrix[0][3];
		double c2 = coefMatrix[1][3];
		double c3 = coefMatrix[2][3];

		return (c1 * a22 * a33) + (a12 * a23 * c3) + (a13 * c2 * a32) -
			(a13 * a22 * c3) - (c1 * a23 * a32) - (a12 * c2 * a33);
	}
	
	public static double determinantX2(double coefMatrix[][] )
	{
		double a11 = coefMatrix[0][0];
		double a13 = coefMatrix[0][2];
		double a21 = coefMatrix[1][0];
		double a23 = coefMatrix[1][2];
		double a31 = coefMatrix[2][0];
		double a33 = coefMatrix[2][2];
		double c1 = coefMatrix[0][3];
		double c2 = coefMatrix[1][3];
		double c3 = coefMatrix[2][3];

		return (a11 * c2 * a33) + (c1 * a23 * a31) + (a13 * a21 * c3) -
				(a13 * c2 * a31) - (a11 * a23 * c3) - (c1 * a21 * a33);
		}
	
	public static double determinantX3(double coefMatrix[][] )
	{
		double a11 = coefMatrix[0][0];
		double a12 = coefMatrix[0][1];
		double a21 = coefMatrix[1][0];
		double a22 = coefMatrix[1][1];
		double a31 = coefMatrix[2][0];
		double a32 = coefMatrix[2][1];
		double c1 = coefMatrix[0][3];
		double c2 = coefMatrix[1][3];
		double c3 = coefMatrix[2][3];

		return (a11 * a22 * c3) + (a12 * c2 * a31) + (c1 * a21 * a32) -
				(c1 * a22 * a31) - (a11 * c2 * a32) - (a12 * a21 * c3);
	}

	}

