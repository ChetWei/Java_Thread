package threadLearning;

/***
 * ʹ�ýӿڵķ�ʽʵ�ֶ��߳�,���ⵥ�̳еľ���
 * @author Administrator
 *
 */
public class MyThread2 implements Runnable {

	private String name ;
	
	public MyThread2(String name) {
		this.name = name ;
	}
	
	
	@Override
	public void run() {
		for(int x = 0 ; x <200 ;x++) {
			System.out.println(this.name+"-->"+x);
		}

	}

}
