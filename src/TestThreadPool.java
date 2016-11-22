import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {
    private static int produceTaskSleepTime = 2;
    private static int produceTaskMaxNumber = 1000;

    public static void main(String args[]) throws InterruptedException {
        /**
         *int corePoolSize,线程池基本大小
          int maximumPoolSize,最大线程池大小
          long keepAliveTime,当线程池中的线程数量大于 corePoolSize时，如果某线程空闲时间超过keepAliveTime，线程将被终止。这样，线程池可以动态的调整池中的线程数。
          TimeUnit unit,
          BlockingQueue<Runnable> workQueue,
          RejectedExecutionHandler handler ：核心线程corePoolSize、任务队列workQueue、最大线程maximumPoolSize，如果三者都满了，使用handler处理被拒绝的任务
         */
        SelfThreadPoolExecutor threadPoolExecutor = new SelfThreadPoolExecutor(2, 4, 3, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(3), new ThreadPoolExecutor.DiscardOldestPolicy());
        for (int i = 1; i <= produceTaskMaxNumber; i++) {
            String taskId = "task@" + i;
            System.out.println("提交任务" + taskId);
            threadPoolExecutor.execute(new ThreadPoolTask(taskId));
            Thread.sleep(produceTaskSleepTime);
        }
        threadPoolExecutor.shutdown();
        System.out.println(threadPoolExecutor.getCompletedTaskCount() + ".." + threadPoolExecutor.getTaskCount());
    }
}
