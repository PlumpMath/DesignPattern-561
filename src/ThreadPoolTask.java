
public class ThreadPoolTask implements Runnable {
    private Object data;

    public ThreadPoolTask(Object data) {
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("....开始执行" + data);
        data = null;
    }

}
