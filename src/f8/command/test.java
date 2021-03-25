package f8.command;

public class test {
    public static void main(String[] args) {
        Factory factory=new Factory();
        StartWork startWork = new StartWork(factory);
        EndWork endWork = new EndWork(factory);
        FactoryInvoker factoryInvoker = new FactoryInvoker(endWork);
        startWork.execute();
        factoryInvoker.execute();
    }
}
