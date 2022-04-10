package model;

import java.util.Comparator;

public class PriorityQueue<T> {
    private int size;
    private Object H[];
    private Comparator<T> comparator;

    public PriorityQueue(int max_size) {
        H = new Object[max_size];
    }

    public PriorityQueue(int max_size, Comparator<T> comparator) {
        this.comparator = comparator;
        H = new Object[max_size];
    }

    @SuppressWarnings("unchecked")
	private T parent(int i) {
        return (T) H[(i - 1) / 2];
    }

    @SuppressWarnings("unchecked")
	private T left(int i) {
        return (T) H[2 * i + 1];
    }

    @SuppressWarnings("unchecked")
	private T right(int i) {
        return (T) H[2 * i + 2];
    }

    // return e1>=e2
    @SuppressWarnings("unchecked")
	private boolean greaterThanOrEqualTo(T e1, T e2) {
        if (comparator != null) {
            return comparator.compare(e1, e2) >= 0;
        } else {
            return ((Comparable<T>) e1).compareTo(e2) >= 0;
        }
    }

    // return e1<e2
    @SuppressWarnings("unchecked")
	private boolean lessThan(T e1, T e2) {
        if (comparator != null) {
            return comparator.compare(e1, e2) < 0;
        } else {
            return ((Comparable<T>) e1).compareTo(e2) < 0;
        }
    }

    private void swap(int i1, int i2) {
        T temp = get(i1);
        H[i1] = H[i2];
        H[i2] = temp;
    }

    @SuppressWarnings("unchecked")
	private T get(int i) {
        return (T) H[i];
    }

    private void shiftUp(int i) {
        while (i > 0 & greaterThanOrEqualTo(get(i), parent(i))) {
            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    private void shiftDown(int i) {
        int max_index = i;

        if ((2 * i + 1) <= size - 1 && lessThan(get(max_index), left(i)))
            max_index = 2 * i + 1;

        if (((2 * i + 2) <= size - 1) && (lessThan(get(max_index), right(i))))
            max_index = 2 * i + 2;

        if (i != max_index) {
            swap(i, max_index);
            shiftDown(max_index);
        }
    }

    public void offer(T data) throws Exception {
        if (size == H.length)
            throw new Exception("Queue is full");
        else {
            H[size] = (T) data;
            shiftUp(size);
            size++;
        }
    }

    public T peek() {
        return get(0);
    }

    public T poll() throws Exception {
        if (size == 0) {
            throw new Exception("Queue is empty");
        } else {
            T result = get(0);

            H[0] = H[size - 1];
            size--;
            shiftDown(0);
            return result;
        }
    }
}