package threadLearning;

/***
 * ʹ�ü̳еķ�ʽʵ�ֶ��߳�
 * @author Administrator
 *
 */
public class MyThread extends Thread {

	private String name ;
	
	public MyThread(String name) {
		this.name = name ;
	}
	
	public void run() {
		for(int x = 0 ; x <200 ;x++) {
			System.out.println(this.name+"-->"+x);
		}
	}
	
}
