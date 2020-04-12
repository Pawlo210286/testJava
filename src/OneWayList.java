import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class OneWayList<T> implements List<T> {

    private Node<T> head;
    private Node<T> tail;

    private int size = 0;

    public Node<T> getHead() {
        return head;
    }

    @Override
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

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
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