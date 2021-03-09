package f5;

public class One {
    private static One SINGLE;
    private One() {}
    public static One getInstance() {
        if (SINGLE == null) {
            synchronized (One.class) {
                SINGLE = new One();
            }
        }
        return SINGLE;
    }
}
