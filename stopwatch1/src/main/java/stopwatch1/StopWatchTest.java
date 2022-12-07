package stopwatch1;

import org.apache.commons.lang3.time.StopWatch;




 
public class StopWatchTest 
{
	public static void main(String[] args) throws InterruptedException {
		StopWatch watch = new StopWatch();
		watch.start();
		
		// ������� ��������� ����� � ������
		Thread.sleep(1000);
		System.out.println(watch.getTime());
		
		 // �������������� ������ �������
		Thread.sleep(1000);
		watch.split();
		System.out.println(watch.getSplitTime());
		
		 // �������������� ������ �������
		Thread.sleep(1000);
		watch.split();
		System.out.println(watch.getSplitTime());
		
		 // ����� ������ ��������� �����
		watch.reset();
		watch.start();
		Thread.sleep(1000);
		System.out.println(watch.getTime());
		
		 // ����� � �������������
		watch.suspend();
		 System.out.println ("����� �� 2 �������");
		Thread.sleep(2000);
		
		watch.resume();
		Thread.sleep(1000);
		watch.stop();
		System.out.println(watch.getTime());
	}
}
