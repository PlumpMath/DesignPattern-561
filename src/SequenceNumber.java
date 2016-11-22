
public class SequenceNumber {
    public SequenceNumber() {

    }

    /**
     * threadLocal为每个线程维护一个单独的副本，互不影响
     */
    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }

    };

    public int getNextNum() {
        seqNum.set(seqNum.get() + 1);
        return seqNum.get();
    }

    public void doStart(SequenceNumber sn) {
        new DoTest(sn).start();
    }

    public static void main(String args[]) {
        SequenceNumber sn = new SequenceNumber();
        sn.doStart(sn);
        sn.doStart(sn);
        sn.doStart(sn);
        sn.doStart(sn);
    }

    public class DoTest extends Thread {
        private SequenceNumber _sn;

        public DoTest(SequenceNumber sn) {
            this._sn = sn;
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + ":sn=" + _sn.getNextNum());
            }
        }

    }

}
