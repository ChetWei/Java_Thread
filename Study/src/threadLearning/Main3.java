package threadLearning;

public class Main3 {

	public static void main(String[] args) {
/*		MyThread8 mt = new MyThread8();
		Thread t1 = new Thread(mt,"Æ±··×ÓA");
		Thread t2 = new Thread(mt,"Æ±··×ÓB");
		Thread t3 = new Thread(mt,"Æ±··×ÓC");
		Thread t4 = new Thread(mt,"Æ±··×ÓD");
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();*/
		
		MyThread9 thread = new MyThread9();
		new Thread(thread,"Æ±··×ÓA").start();
		new Thread(thread,"Æ±··×ÓB").start();
		new Thread(thread,"Æ±··×ÓC").start();
		
	}
}
