package f5;

public class Three {
    private static Three SINGLE;
    private Three() {}
    public static Three getInstance() {
        if (SINGLE == null) {
            synchronized (Three.class) {
                if (SINGLE == null) {
                    SINGLE = new Three();
                }
            }
        }
        return SINGLE;
    }
}
