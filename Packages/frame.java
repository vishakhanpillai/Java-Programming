import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class frame {
    public static void main(String[] args) {
        
        LinkedList <Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);

        LinkedList ls = new LinkedList<>();
        ls = (LinkedList) ll.clone();

        ListIterator <Integer> li = ll.listIterator();

        while(li.hasNext()){
            System.out.print(li.next());
        }

        while (li.hasPrevious()) {
            System.out.print(li.previous());
        }

        System.out.println(ls);

    }
}
