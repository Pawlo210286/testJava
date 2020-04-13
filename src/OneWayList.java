public class OneWayList<T> {

    private Node<T> head;
    private Node<T> tail;

    private int size = 0;

    public Node<T> getHead() {
        return head;
    }


    public boolean add(T t) {
        Node<T> nd = new Node<T>();
        nd.setValue(t);

        if (head == null) {
            head = nd;
        } else {
            tail.setNextRef(nd);
        }
        tail = nd;
        size++;

        return true;
    }

    static class Node<T> implements Comparable<T> {

        private T value;
        private Node<T> nextRef;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNextRef() {
            return nextRef;
        }

        public void setNextRef(Node<T> ref) {
            this.nextRef = ref;
        }

        @Override
        public int compareTo(T arg) {
            if (arg == this.value) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
