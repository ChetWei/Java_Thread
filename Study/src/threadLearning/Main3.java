package threadLearning;

public class Main3 {

	public static void main(String[] args) {
/*		MyThread8 mt = new MyThread8();
		Thread t1 = new Thread(mt,"Ʊ����A");
		Thread t2 = new Thread(mt,"Ʊ����B");
		Thread t3 = new Thread(mt,"Ʊ����C");
		Thread t4 = new Thread(mt,"Ʊ����D");
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();*/
		
		MyThread9 thread = new MyThread9();
		new Thread(thread,"Ʊ����A").start();
		new Thread(thread,"Ʊ����B").start();
		new Thread(thread,"Ʊ����C").start();
		
	}
}
