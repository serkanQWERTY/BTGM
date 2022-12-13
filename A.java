import java.lang.ref.Cleaner;

public class A implements AutoCloseable {
    private final State state;
    private final Cleaner.Cleanable cleanable;
    private static final Cleaner cleaner = Cleaner.create();
    public A(State state, Cleaner.Cleanable cleanable) {
        this.state = state;
        this.cleanable = cleanable;
    }

    public A() {
        this.state = new State();
        this.cleanable = cleaner.register(this, state);
        System.out.println("A's Constructor is  Called!");
    }

    static class State implements Runnable {
      State() {
            System.out.println("A's cleaning action. ");
            // initialize State needed for cleaning action
             }

         public void run() {
            // cleanup action accessing State, executed at most once
             System.out.println("A's Finalizer is called. ");
             }
    }

    public void close() {

        cleanable.clean();
    }
 }
