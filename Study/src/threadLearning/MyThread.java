package threadLearning;

/***
 * 使用继承的方式实现多线程
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
