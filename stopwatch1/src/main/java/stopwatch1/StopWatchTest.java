package stopwatch1;

import org.apache.commons.lang3.time.StopWatch;




 
public class StopWatchTest 
{
	public static void main(String[] args) throws InterruptedException {
		StopWatch watch = new StopWatch();
		watch.start();
		
		// Считаем прошедшее время с начала
		Thread.sleep(1000);
		System.out.println(watch.getTime());
		
		 // Статистический момент времени
		Thread.sleep(1000);
		watch.split();
		System.out.println(watch.getSplitTime());
		
		 // Статистический момент времени
		Thread.sleep(1000);
		watch.split();
		System.out.println(watch.getSplitTime());
		
		 // После сброса повторное время
		watch.reset();
		watch.start();
		Thread.sleep(1000);
		System.out.println(watch.getTime());
		
		 // Пауза и возобновление
		watch.suspend();
		 System.out.println ("Пауза на 2 секунды");
		Thread.sleep(2000);
		
		watch.resume();
		Thread.sleep(1000);
		watch.stop();
		System.out.println(watch.getTime());
	}
}
