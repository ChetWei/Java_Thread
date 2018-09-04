package threadLearning;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		/***继承Thread方式的多线程, start方法启动***/
	/*		MyThread mt1 = new MyThread("线程A");
			MyThread mt2 = new MyThread("线程B");
			MyThread mt3 = new MyThread("线程C");
			
			//启动多线程
			mt1.start();
			mt2.start();
			mt3.start();*/
		
			
		/***实现Runnable接口的多线程，,Thread是Runnable接口 的子类（代理），
		 * 通过Thread类对象包装Runnable接口对象实例，然后利用Thread 类的start()方法启动多线程***/
/*			MyThread2 mt01 = new MyThread2("线程1");
			MyThread2 mt02 = new MyThread2("线程2");
			MyThread2 mt03 = new MyThread2("线程3");
			MyThread2 mt04 = new MyThread2("线程4");
			
			new Thread(mt01).start();
			new Thread(mt02).start();
			new Thread(mt03).start();
			new Thread(mt04).start();*/
		
		
	/*	MyThread3 mt1 = new MyThread3();
		MyThread3 mt2 = new MyThread3();
		MyThread3 mt3 = new MyThread3();
		mt1.start();
		mt2.start();
		mt3.start();*/
		
		/*MyThread4 mt = new MyThread4();
		//启动线程对象
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();*/
		
	/***实现callable 接口的多线程,可以返回结果；
	 * RunnableFuture接口 实现了Runnable接口和Future接口
	 * FutureTask 又实现了 RunnableFuture 接口
	 * ***/	
		MyThread5 mt1 = new MyThread5();
		MyThread5 mt2 = new MyThread5();
		
		FutureTask<String> task1 = new FutureTask<String>(mt1);
		FutureTask<String> task2 = new FutureTask<String>(mt2);
		//FutureTask是Runnable接口子类，所以可以使用Thread类的构造来接收task对象
		
		new Thread(task1).start();
		new Thread(task2).start();
		
		//多线程执行完毕后可以取得内容
		
		System.out.println("A线程的返回结果"+task1.get());
		System.out.println("B线程的返回结果"+task2.get());
		
	}
}
