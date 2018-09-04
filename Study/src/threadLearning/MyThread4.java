package threadLearning;

public class MyThread4 implements Runnable {

	private int ticket = 5;
	
	@Override
	public void run() {
		for(int i =0;i<50;i++) {
			if (this.ticket>0) {
				System.out.println("ÂòÆ±,ticket="+this.ticket --);
			}
		}

	}

}
