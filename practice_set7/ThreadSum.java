package practice_set7;

class sum extends Thread{

    private int start, end;
    private int add = 0;

    sum(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void run(){
    for(int i = start; i <= end; i++){
        add += i;
    }
    }

    public long getAdd(){
        return add;
    }

}


public class ThreadSum {
    public static void main(String[] args){
        sum s1 = new sum(1, 1000);
        sum s2 = new sum(1001, 2000);

        s1.start();
        s2.start();

        try{
            s1.join();
            s2.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }

        int totalSum = (int)(s1.getAdd() + s2.getAdd());
        System.out.println("The sum of first 2000 natural numbers is: " + totalSum);
    }
    
}
