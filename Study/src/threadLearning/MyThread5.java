package threadLearning;

import java.util.concurrent.Callable;
/***
 * ���ز�������Ķ��߳̽ӿ� Callable<V>
 * @author Administrator
 *
 */
public class MyThread5 implements Callable<String> {

	private int ticket = 0 ;
	@Override
	public String call() throws Exception {
		for(int i = 0 ; i <100; i ++) {
			if(this.ticket > 0) {
				System.out.println("����,ʣ��"+this.ticket --);
			}
		}
		return "Ʊ������!";
	}

}
