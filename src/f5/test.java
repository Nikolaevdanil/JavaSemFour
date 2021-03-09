package f5;

public class test {
    public static void main(String[] args) {
        One one1 = One.getInstance();
        One one2 = One.getInstance();
        Deux deux1 = Deux.getInstance();
        Deux deux2 = Deux.getInstance();
        Three three1 = Three.getInstance();
        Three three2 = Three.getInstance();
        System.out.println(one2);
        System.out.println(one1);
        System.out.println(deux1);
        System.out.println(deux2);
        System.out.println(three1);
        System.out.println(three2);
    }
}
