package hello;

public class ExtendThread2 {


		public static void main(String[] args) {
			new NewThread2();
			
			
			try
			{
			for(int i=5;i>0;i--)
			{
				System.out.println("Main поток"+i);
				Thread.sleep(1000);;
			}
			}
			catch(InterruptedException e)
			{
				System.out.println("execution is cancelled");
			}
		
			System.out.println("Главный поток завершен");
		}

	}
