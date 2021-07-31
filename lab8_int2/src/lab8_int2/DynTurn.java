package lab8_int2;
import java.util.Scanner;
import java.util.ArrayList;

public class DynTurn implements Filter, intTurn {

	
		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		@Override
		public void goIn(int element)
		{
		System.out.println("¬ведите елемент");
		array.add(element);
		}
		
		@Override
		public void goOut() {
			System.out.println("¬ведите номер удал€емого елемента");
			array.remove(scan.nextInt());
		}
		
		
		
		@Override
		public void filted_goIn()
		{
		System.out.println("hello");
		for (int a=0; a<9; a++)
		{
		int number = scan.nextInt();
		if(number>99 && number<1000)
		{
			if (number != Filter.Except1 & number != Filter.Except2)
			{
				array.add(number);
			}
			else
			{
				System.out.print("cant enter this number");
			}
		}
		}
		}
		}
	


