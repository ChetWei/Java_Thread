package threadLearning;

public class MyThread9 implements Runnable {
	
	private int ticket = 10000 ;
	
	@Override
	public void run() {
		for(int x = 0;x <200000000;x++) {
			this.sale();
		}
		
	}
	
	public synchronized void sale() {
		if(this.ticket > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"ÂôÆ±,ticket="+this.ticket--);
		}
	}

}
