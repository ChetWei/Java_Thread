package threadLearning;

public class Main2 {
	public static void main(String[] args) {
		/***
		 * 设置线程名称
		 */
		/*MyThread6 mt = new MyThread6();
		new Thread(mt,"自己的线程对象A").start(); //获取线程对象同时设置线程名称
*/	
		
		/***
		 * 线程优先级
		 */
		MyThread7 mt = new MyThread7();
		
		Thread t1 = new Thread(mt,"线程对象A");
		Thread t2 = new Thread(mt,"线程对象B");
		Thread t3 = new Thread(mt,"线程对象C,设置了优先级");
		
		t3.setPriority(Thread.MAX_PRIORITY); //修改一个线程对象的优先级
	
		t1.start();
		t2.start();
		t3.start();
	}
}
