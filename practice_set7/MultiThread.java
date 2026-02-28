package practice_set7;

class Threadone extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Thread one is running: " + i);
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Thread one interrupted: " + e.getMessage());
        }
    }
}

class Threadtwo extends Thread{
    public void run(){
        for(int i = 11; i <= 20; i++){
            System.out.println("Thread two is running: " + i);
        }
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Thread two interrupted: " + e.getMessage());
        }
    }
}

public class MultiThread {
    public static void main(String[] args){
        Threadone t1 = new Threadone();
        Threadtwo t2 = new Threadtwo();

        t1.start();
        t2.start();

    }
    
}
