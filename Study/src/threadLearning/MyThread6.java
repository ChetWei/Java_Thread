
package threadLearning;

public class MyThread6 implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<100;i++) { 
			try {
				Thread.sleep(1000); // �߳�˯��
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+",i = " + i ); //ȡ���̵߳�����
		}
		
	}

}