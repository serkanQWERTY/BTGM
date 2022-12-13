import java.lang.ref.Cleaner;

public class B  {

    public B(){
        /*
        For Debug
         */
        System.out.println("B's Constructor is Called!");
    }

    protected void finalize(){
        /*
        For Debug
         */
        System.out.println("B's Finalizer is called.");
    }
}