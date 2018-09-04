package threadLearning;

public class MyThread8 implements Runnable {

	private int ticket = 10 ;
	@Override
	public void run() {
		for(int x =0;x<20;x++) {
			synchronized (this) {
				if(this.ticket > 0) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"ÂôÆ±,ticket="+this.ticket --);
				}
			}
		}

	}

}
