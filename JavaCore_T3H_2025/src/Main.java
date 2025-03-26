
// Collection

import com.sun.source.tree.CaseTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1 Danh sách ca số nguyên
        List<Integer> arrayNumber = new ArrayList<Integer>();
        // them phan tu vao collection
        arrayNumber.add(1);
        arrayNumber.add(2);
        arrayNumber.add(3);
        arrayNumber.add(4);

        //Lay phan tu tu collection thong qua index
        System.out.println(arrayNumber.get(0));
        System.out.println(arrayNumber.get(1));
        System.out.println(arrayNumber.get(2));


        // Khoi tao mot set cac phan tu String
        Set<String> set = new HashSet<String>();
        //Them moi cac phan tu vao set
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        //Bien set thanh Iterator de duyet cac phan tu
        Iterator<String> setIterator = set.iterator();
        //Lay mot phan tu cua set
        setIterator.next();
        while (setIterator.hasNext()) { // Neu set van con phan tu
            // --> Lay ra phan tu do tu set
            System.out.println(setIterator.next());
        }


        //Khoi tao queue voi linkedlist
        Queue<Integer> queue = new LinkedList<>();
        // Them phan tu vao queue
        queue.add(1);
        queue.add(2);
        queue.add(3);

        //Lay ra phan tu
        queue.stream().forEach((data) -> {
            System.out.println(data);
        });
    }
}