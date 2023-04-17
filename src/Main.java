import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer,String> newHashMap = new ConcurrentHashMap<>();
        newHashMap.put(1 ,"Misha");
        newHashMap.put(2 ,"Misha2");
        newHashMap.put(3 ,"Misha3");
        newHashMap.put(4 ,"Misha4");

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = newHashMap.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println(i + ":" + newHashMap.get(i));
            }
        };

        Runnable runnable2 = () -> {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                newHashMap.put(6,"Misha6");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();

    }

}

