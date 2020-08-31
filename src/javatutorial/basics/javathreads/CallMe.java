package javatutorial.basics.javathreads;

    public class CallMe {
        synchronized void call(String msg) {
            try {
                System.out.print("[" + msg);
                Thread.sleep(3000);
            } catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println("]");
        }
    }

