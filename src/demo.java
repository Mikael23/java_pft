import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class demo {
	private final static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

	private final static Lock readLock = readWriteLock.readLock();

	private final static Lock writeLock = readWriteLock.writeLock();
	static int[] book = new int[5];
	static Random random = new Random();

	public static void main(String[] args) throws Exception {

		ExecutorService ex = Executors.newFixedThreadPool(3);
		Runnable taskWrite = nextPage();
		Runnable task = read();
		ex.submit(task);
		ex.submit(task);
		ex.submit(taskWrite);
		ex.shutdown();
		ex.shutdown();
		ex.shutdown();
	}

	public static Runnable read() throws InterruptedException {
		readLock.lock();
		try {
			for (int i = 0; i <= book.length; i++) {
				System.out.println(book[i]);
				System.out.println(Thread.currentThread().getName());
				
			}
			Thread.sleep(1000);
		} finally {
			readLock.unlock();
		}
		return null;

	}

	public static Runnable nextPage() throws InterruptedException {
		writeLock.lock();
		try {
			System.out.println("nextPage start");
			for (int i = 0; i < book.length-1; i++) {
				
				book[i] = random.nextInt(5);
			}
				Thread.sleep(5000);
				System.out.println("nextPage finish");
			
		} finally {
			writeLock.unlock();
		}
		return null;

	}

}
