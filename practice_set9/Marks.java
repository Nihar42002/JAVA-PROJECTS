package practice_set9;

import java.util.*;

public class Marks {
    public static void main(String[] args) {
        
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(90);
        marks.add(78);
        marks.add(92);
        marks.add(88);

        for (int mark : marks) {
            System.out.println(mark);
        }

        System.out.println("Highest mark: " + Collections.max(marks));
        System.out.println("Lowest mark: " + Collections.min(marks));
    }
}
