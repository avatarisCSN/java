package hello;

public class NewThread implements Runnable {
	Thread t ;
	NewThread () {
	// ������� �� ��� , �� ���� ����� ����������
	t = new Thread ( this , "���������������� �����" ) ;
	System.out.println( "�o�ep��� ����� ������ : " + t );
	t.start() ;  // � �������� ����� ����������
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
