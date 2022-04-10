package model;

import java.util.NoSuchElementException;

public class Stack<T> implements IStack<T> {

    private model.Node<T> top;
    private int size;


    public Stack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(T data) {
        model.Node<T> element = new model.Node<>(data);
        element.setNext(top);
        top = element;
        size++;
    }

    @Override
    public T pop() {
        if(top == null){
            throw new NoSuchElementException("Can't pop from an empty stack");

        }else {
            model.Node<T> trash = top;
            top = top.next();
            size--;
            return trash.data();

        }
    }

    @Override
    public T top() {
        return top.data();
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
        model.Node<T> head = top;
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