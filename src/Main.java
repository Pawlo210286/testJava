import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var singlyList = new SinglyLinkedListImpl<Integer>();

        for (int i = 0; i < 100; i++) {
            singlyList.add(i);
        }

        var result = splitUpDigits(singlyList.getHead());

        System.out.println(result.get(0));
        System.out.println(result.get(1));
    }


    private static List<LinkedList<Integer>> splitUpDigits(Node<Integer> head) {
        var even = new LinkedList<Integer>();
        var odd = new LinkedList<Integer>();

        while (head.getNextRef() != null) {

            if (head.getValue() % 2 == 0) {
                even.addFirst(head.getValue());
            } else {
                odd.addFirst(head.getValue());
            }

            head = head.getNextRef();
        }

        var result = new ArrayList<LinkedList<Integer>>(2);
        result.add(even);
        result.add(odd);
        return result;
    }


}

