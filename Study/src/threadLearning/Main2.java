package threadLearning;

public class Main2 {
	public static void main(String[] args) {
		/***
		 * �����߳�����
		 */
		/*MyThread6 mt = new MyThread6();
		new Thread(mt,"�Լ����̶߳���A").start(); //��ȡ�̶߳���ͬʱ�����߳�����
*/	
		
		/***
		 * �߳����ȼ�
		 */
		MyThread7 mt = new MyThread7();
		
		Thread t1 = new Thread(mt,"�̶߳���A");
		Thread t2 = new Thread(mt,"�̶߳���B");
		Thread t3 = new Thread(mt,"�̶߳���C,���������ȼ�");
		
		t3.setPriority(Thread.MAX_PRIORITY); //�޸�һ���̶߳�������ȼ�
	
		t1.start();
		t2.start();
		t3.start();
	}
}
