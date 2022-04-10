package model;

public interface IQueue<T> {    
    public abstract void enqueue(T data);
    public abstract T dequeue();
    public abstract T front();
    public abstract boolean isEmpty();
    public abstract int size();
}