package model;


import java.util.NoSuchElementException;


public class Queue<T> implements IQueue<T> {

    private model.Node<T> front;
    private model.Node<T> rear;
    private int size;


    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public void enqueue(T data) {
        model.Node<T> element = new model.Node<>(data);
        if (front == null) {
            rear = element;
            front = element;
        } else {
            rear.setNext(element);
            rear = element;
        }
        size++;
    }

    @Override
    public T dequeue() {
        model.Node<T> trash = front;
        if (front == null) {
            throw new NoSuchElementException("Can't dequeue from an empty queue");
        } else if (front == rear) {
            front = rear = null;
        } else {
            front = front.next();
        }
        size--;
        return trash.data();

    }

    @Override
    public T front() {
        return front.data();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> head = front;
        sb.append("(");
        String prefix = "";
        while (head != null) {
            sb.append(prefix).append(head.data());
            prefix = ", ";
            head = head.next();
        }
        sb.append(")");
        return sb.toString();
    }

}