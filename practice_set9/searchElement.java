package practice_set9;

import java.util.LinkedList;

public class searchElement {
    public static <T> boolean search(LinkedList<T> list, T element){
            return list.contains(element);
        }

    public static void main(String[] args){

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers in the list:"+ numbers);
        System.out.println("Searching for 20: " + search(numbers, 20));
        System.out.println("Searching for 40: " + search(numbers, 40));

        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("\nNames in the list:"+ names);
        System.out.println("Searching for 'Bob': " + search(names, "Bob"));
        System.out.println("Searching for 'David': " + search(names, "David"));
        
    }
}
