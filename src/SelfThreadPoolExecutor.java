import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SelfThreadPoolExecutor extends ThreadPoolExecutor {

    public SelfThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, DiscardOldestPolicy handel) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handel);
    }

    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
        System.out.println("我是执行前");
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);
        System.out.println("我是执行后");
    }

}
