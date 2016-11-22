import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class CountTask extends RecursiveTask<Integer> {
    private static final int threshold = 1000;
    private int              start;
    private int              end;

    public CountTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        boolean canCompute = (end - start) <= threshold;
        //如果任务很小直接执行
        if (canCompute) {
            System.out.println("start=" + start + ",end=" + end);
            for (int i = start; i <= end; i++) {
                sum = sum + i;
            }
        } else {
            //如果任务大于阀值就直接拆分成2个线程
            int middle = (start + end) / 2;
            CountTask leftTask = new CountTask(start, middle);
            CountTask rightTask = new CountTask(middle + 1, end);
            //执行子任务
            leftTask.fork();
            rightTask.fork();
            //等待任务执行完毕，获取结构
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();
            System.out.println("leftResult=" + leftResult + "..rightResult=" + rightResult);
            //合并结果
            sum = leftResult + rightResult;
        }
        return sum;
    }

    public static void main(String args[]) throws InterruptedException, ExecutionException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        CountTask countTask = new CountTask(1, 2000);
        Future<Integer> result = forkJoinPool.submit(countTask);
        System.out.println("result=" + result.get());

    }
}
