package f4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = new MyService(2);

        Future<String> task = executorService.submit(() -> "First");
        executorService.shutdown();
        System.out.println(task.get());
        if (task.isDone() && !task.isCancelled()) {
            System.out.println("Future result: " + task.get());
        }

        executorService.execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Second");
            }
        });
        executorService.shutdown();
        //  executorService.shutdownNow();

        try {
            executorService.submit(() -> "Test");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
