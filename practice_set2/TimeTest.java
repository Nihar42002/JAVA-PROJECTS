class Time {

    int hours;
    int minutes;

    void timeSet(int h, int m)
    {
        hours = h;
        minutes = m;
    }

    void addTime(Time t1, Time t2)
    {
        minutes = t1.minutes + t2.minutes;
       hours = t1.hours + t2.hours;
    
       if(minutes>=60)
       {
        hours = hours + minutes / 60;
        minutes = minutes % 60;
       }
       
    }  
    
    void displayTime()
    {
        System.out.println("Time is: " + hours + " hours and " + minutes + " minutes.");
    }
    
}

class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.timeSet(2, 45);
        t2.timeSet(3, 30);

        t3.addTime(t1, t2);
        t3.displayTime();
    }
}
