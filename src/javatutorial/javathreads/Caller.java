package javatutorial.javathreads;

public class Caller implements Runnable {
    private String msg;
    private CallMe target;
    Thread t;

    public Caller(CallMe target, String s) {
        this.target = target;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        target.call(msg);
    }
}

