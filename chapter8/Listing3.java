public class Bad {
    public static void main(String[] argv) {
        Object[] a = argv;
        a[0] = new Object();
    }
}