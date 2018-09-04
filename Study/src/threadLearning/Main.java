package threadLearning;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		/***�̳�Thread��ʽ�Ķ��߳�, start��������***/
	/*		MyThread mt1 = new MyThread("�߳�A");
			MyThread mt2 = new MyThread("�߳�B");
			MyThread mt3 = new MyThread("�߳�C");
			
			//�������߳�
			mt1.start();
			mt2.start();
			mt3.start();*/
		
			
		/***ʵ��Runnable�ӿڵĶ��̣߳�,Thread��Runnable�ӿ� �����ࣨ������
		 * ͨ��Thread������װRunnable�ӿڶ���ʵ����Ȼ������Thread ���start()�����������߳�***/
/*			MyThread2 mt01 = new MyThread2("�߳�1");
			MyThread2 mt02 = new MyThread2("�߳�2");
			MyThread2 mt03 = new MyThread2("�߳�3");
			MyThread2 mt04 = new MyThread2("�߳�4");
			
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
		//�����̶߳���
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();*/
		
	/***ʵ��callable �ӿڵĶ��߳�,���Է��ؽ����
	 * RunnableFuture�ӿ� ʵ����Runnable�ӿں�Future�ӿ�
	 * FutureTask ��ʵ���� RunnableFuture �ӿ�
	 * ***/	
		MyThread5 mt1 = new MyThread5();
		MyThread5 mt2 = new MyThread5();
		
		FutureTask<String> task1 = new FutureTask<String>(mt1);
		FutureTask<String> task2 = new FutureTask<String>(mt2);
		//FutureTask��Runnable�ӿ����࣬���Կ���ʹ��Thread��Ĺ���������task����
		
		new Thread(task1).start();
		new Thread(task2).start();
		
		//���߳�ִ����Ϻ����ȡ������
		
		System.out.println("A�̵߳ķ��ؽ��"+task1.get());
		System.out.println("B�̵߳ķ��ؽ��"+task2.get());
		
	}
}
