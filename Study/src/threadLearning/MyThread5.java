package threadLearning;

import java.util.concurrent.Callable;
/***
 * 返回操作结果的多线程接口 Callable<V>
 * @author Administrator
 *
 */
public class MyThread5 implements Callable<String> {

	private int ticket = 0 ;
	@Override
	public String call() throws Exception {
		for(int i = 0 ; i <100; i ++) {
			if(this.ticket > 0) {
				System.out.println("卖出,剩余"+this.ticket --);
			}
		}
		return "票卖完了!";
	}

}
