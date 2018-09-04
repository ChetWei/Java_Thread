package threadLearning;

public class MyThread7 implements Runnable {

	@Override
	public void run() {
		for(int x = 0; x <20 ;x++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {	
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+",x="+x);
		}
	}

}
