package hello;

public class NewThread2 extends Thread {
	
	NewThread2 () {
		super("���������������� �����");
		
	System.out.println( "�o�ep��� ����� ������ : " + this );
	start() ;  // � �������� ����� ����������
	}
	@Override
	public void run() {
		try
		{
		for(int i=5;i>0;i--)
		{
			System.out.println("�������� �����"+i);
			Thread.sleep(500);;
		}	
		}
		catch(InterruptedException e)
		{
			System.out.println("execution is cancelled");
		}
		System.out.println("�������� ����� ��������");
	}

}
