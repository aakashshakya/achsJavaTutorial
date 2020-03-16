package javatutorial.javathreads;

public class ThreadJoinApplication {
    public static void main(String[] args) {

        ThreadJoin t1 = new ThreadJoin("first thread");
        ThreadJoin t2 = new ThreadJoin("second thread");
        ThreadJoin t3 = new ThreadJoin("third thread");

        // thread t1 starts
        t1.start();

        // starts second thread after when
        // first thread t1 has died.
        try {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            System.out.println("Thread " + t1.getName() + " is alive: " + t1.isAlive());
            t1.join();
        } catch (Exception ex) {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }

        // t2 starts
        t2.start();

        // starts t3 after when thread t2 has died.
        try {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            t2.join();
            System.out.println("Thread " + t2.getName() + " is alive: " + t2.isAlive());
        } catch (Exception ex) {
            System.out.println("Exception has been" +
                    " caught" + ex);
        }
        t3.start();
    }
}

