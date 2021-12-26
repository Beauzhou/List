package by.bsu.lists;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.stream()
                .map(x ->x*x*x)
                .filter(x->x>5)
                .forEach(x ->
                        System.out.println(x)
                );
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.contains(1));

        list.set(0, 5);
        System.out.println(list.contains(1));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
