

package lab7_inter;
import java.util.ArrayList;
import java.util.Scanner;

public class DynTurn implements inTurn {
	Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
	ArrayList<Integer> array = new ArrayList();

	@Override
	public void goIn() {
		System.out.println("write end when want to stop");
		while (!scanner.hasNext("end"))
		{
			array.add(scanner.nextInt());
		}
		System.out.println(array);
		
        
		

	}

	@Override
	public void goOut() {
		System.out.println("remove by index");
        array.remove(scanner1.nextInt());
        System.out.println(array);
    
	}

}
