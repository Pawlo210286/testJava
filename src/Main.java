import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var singlyList = new SinglyLinkedListImpl<Integer>();

        for (int i = 0; i < 100; i++) {
            singlyList.add(i);
        }

        var result = splitUpDigits(singlyList.getHead(), new LinkedList<>(), new LinkedList<>());

        System.out.print(result.get(0));
        System.out.print(result.get(1));
    }


    private static List<LinkedList<Integer>> splitUpDigits(Node<Integer> head, LinkedList<Integer> even, LinkedList<Integer> odd) {
        if (head != null) {
            if (head.getValue() % 2 == 0) {
                even.add(head.getValue());
            } else {
                odd.add(head.getValue());
            }
            splitUpDigits(head.getNextRef(), even, odd);
        }

        var result = new ArrayList<LinkedList<Integer>>(2);
        result.add(even);
        result.add(odd);
        return result;
    }


}

