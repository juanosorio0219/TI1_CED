package model;

public interface IStack<T> {
    public abstract void push(T data);
    public abstract T pop();
    public abstract T top();
    public abstract boolean isEmpty();
    public abstract int size();
}