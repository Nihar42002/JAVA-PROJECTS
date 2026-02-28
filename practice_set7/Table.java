package practice_set7;

class T5{

    synchronized void printTable(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n+" * "+i+" = "+(n*i));

            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class thread1 extends Thread{
    T5 t;
    thread1(T5 t){
        this.t = t;
    }


    public void run(){
        t.printTable(5);
    }
}

class thread2 extends Thread{
    T5 t;
    thread2(T5 t){
        this.t = t;
    }
    

    public void run(){
        t.printTable(7);
    }
}

public class Table {
    public static void main(String[] args){
        T5 obj = new T5();
        thread1 t1 = new thread1(obj);
        thread2 t2 = new thread2(obj);

        t1.start();
        t2.start();
    }
    
}
