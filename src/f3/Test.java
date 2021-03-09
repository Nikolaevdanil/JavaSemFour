package f3;

public class Test {
    private static final ListLock<Integer> list = new ListLock<>();
    private static final MapLock<String,String> map = new MapLock<String,String>();

    public static void ListSyncTask() throws InterruptedException {
        System.out.println("ListLock starts");
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 starts");
            for (int i = 1; i < 5; i++) {
                list.add(i);
            }
            list.print();
            System.out.println("Thread 1 ends");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 starts");
            for (int i = 5; i < 11; i++) {
                list.add(i);
            }
            list.print();
            System.out.println("Thread 2 ends");
        });
        thread1.start();
        Thread.sleep(100);
        thread2.start();
        Thread.sleep(100);
        System.out.println("ListLock ends");
    }
    public static void SetSemTask() throws InterruptedException {
        System.out.println("MapLock starts");
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 starts");
            for (int i = 1; i < 4; i++) {
                map.put("String " + i,"String " + i+1);
            }
            map.print();
            System.out.println("Thread 1 ends");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 starts");
            for (int i = 5; i < 11; i++) {
                map.put("String " + i,"String " + i+1);
            }
            map.print();
            System.out.println("Thread 2 ends");
        });
        thread1.start();
        Thread.sleep(100);
        thread2.start();
        Thread.sleep(100);

        System.out.println("MapLock ends");
    }


    public static void main(String[] args) throws InterruptedException {
        Test.ListSyncTask();
        System.out.println();
        Test.SetSemTask();
    }
}