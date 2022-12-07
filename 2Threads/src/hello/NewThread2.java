package hello;

public class NewThread2 extends Thread {
	
	NewThread2 () {
		super("Демонстрационный поток");
		
	System.out.println( "Дoчepний поток создан : " + this );
	start() ;  // з апустить поток исполнения
	}
	@Override
	public void run() {
		try
		{
		for(int i=5;i>0;i--)
		{
			System.out.println("Дочерний поток"+i);
			Thread.sleep(500);;
		}	
		}
		catch(InterruptedException e)
		{
			System.out.println("execution is cancelled");
		}
		System.out.println("Дочерний поток завершен");
	}

}
