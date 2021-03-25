package f8.command;

public class EndWork implements Command {
    Factory factory;

    public EndWork(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void execute() {
        factory.endWorkFactory();
    }
}