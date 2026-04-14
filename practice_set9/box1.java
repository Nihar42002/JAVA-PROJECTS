package practice_set9;

import java.util.ArrayList;

class box<T> {
    ArrayList<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
    }
    
    void display(){
        for(T item : list){
            System.out.println(item);
        }
    }
}

public class box1 {
    public static void main(String[] args){
        box<Integer> intBox = new box<>();
        intBox.add(10);
        intBox.add(20);
        intBox.add(30);

        System.out.println("Integer Box:");
        intBox.display();

        box<String> strBox = new box<>();
        strBox.add("Hello");
        strBox.add("World");
        strBox.add("Java");

        System.out.println("\nString Box:");
        strBox.display();
    }
}
