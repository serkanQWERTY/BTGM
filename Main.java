public class Main {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        System.out.println(a.toString());
        System.out.println(b.toString());

        a = null;
        b = null;

        System.gc();
        System.out.println("end main...");
        /**
         * remove below comments to wait some time. You may need this to see the finalizers output.
         *
         */
		System.out.println("end main...");
		System.out.println("end main...");
		System.out.println("end main...");
        System.out.println("end main...");
        System.out.println("end main...");
        System.out.println("end main...");
        System.out.println("end main...");
        System.out.println("end main...");
        System.out.println("end main...");
    }
}