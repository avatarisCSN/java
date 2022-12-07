package hello;

public class NewThread implements Runnable {
	Thread t ;
	NewThread () {
	// создать но вый , вт орой поток исполнения
	t = new Thread ( this , "Демонстрационный поток" ) ;
	System.out.println( "Дoчepний поток создан : " + t );
	t.start() ;  // з апустить поток исполнения
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
