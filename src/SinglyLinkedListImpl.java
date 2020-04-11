public class SinglyLinkedListImpl<T> {

    private Node<T> head;
    private Node<T> tail;

    public Node<T> getHead() {
        return head;
    }

    public void add(T element) {
        Node<T> nd = new Node<T>();
        nd.setValue(element);

        if (head == null) {
            head = nd;
        } else {
            tail.setNextRef(nd);
        }
        tail = nd;
    }

    public void deleteFront() {

        if (head == null) {
            System.out.println("Underflow...");
        }
        Node<T> tmp = head;
        head = tmp.getNextRef();
        if (head == null) {
            tail = null;
        }
        System.out.println("Deleted: " + tmp.getValue());
    }

}
