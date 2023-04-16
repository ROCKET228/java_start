
public class Main {

    public static void main(String[] args){
       MyThread thread = new MyThread();
       thread.start();
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println(i);
        }
    }
}
