package Week4;

import org.junit.Before;
import org.junit.Test;

import java.util.Timer;
import java.util.TimerTask;

public class BiSectionTest {
	private BiSectionExample bi;
	public class Reminder {
		Timer timer;

		public Reminder(int seconds) {
			timer = new Timer();
			timer.schedule(new RemindTask(), seconds*1000);
		}

		class RemindTask extends TimerTask {
			public void run() {
				System.out.format("Time's up!");
				timer.cancel(); //Terminate the timer thread
			}
		}
	}
	
	@Before 
	public void runBeforeEachTest()
	{
		bi = new BiSectionExample();
	}
	
	@Test
	public void test4MethodCoverage () {
		//System.out.print(bi.root(0.5, 100.3, 0.1));
		assert (bi.root(0.5, 100.3, 0.1) >= 100);
		//question: should we assert the returned value is the exact value we expect?
	}
	
	@Test 
	public void test4LoopCoverage1 () {//loop once
		assert(bi.root(0,100,80) > 50);
	}

	@Test
	public void test4LoopCoverage2 () {//loop once
		try{assert(bi.root(1000,100,80) > 50);
		}catch (Exception e){
			System.out.print("True");
		}
	}
	@Test
	public void test4LoopCoverage3 () {
		System.out.print("Infinite go!");
		new Reminder(5);//loop once
		assert(bi.root(1,20,-10) > 0);

	}
}
