package f6.AbstractFactory;

public class test {
    public static void main(String[] args) {
        Factory1 factory1=new Factory1();
        Factory2 factory2=new Factory2();
        System.out.println(factory1.createProduct().getName());
        System.out.println(factory2.createProduct().getName());
    }
}