package web.com.service;

import java.util.concurrent.CountDownLatch;

/**
 * @author:lc
 * @date:2020/3/24
 * @description:spring
 */
public class OrderService implements Runnable {

	//模拟并发
  private static CountDownLatch countDownLatch = new CountDownLatch(20);

  // lock 和 synChrization

	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			new Thread(new OrderService()).start();
			countDownLatch.countDown();
		}
	}

	@Override
	public void run() {
		try {
			countDownLatch.await();
			//实现逻辑

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
