package threadLearning;

public class MyThread3 extends Thread {

	private int ticket = 5 ;
	
	public void run() {
		for(int i = 0;i<50;i++) {
			if(this.ticket > 0) {
				System.out.println("ÊÛ³öÆ±£¬Ê£Óà:"+this.ticket--);
			}
		}
	}
}
