package collection;

public interface OwnQueueList<E> {
	
	public Node<E> front();

    public void setFront(Node<E> first);

    public void enqueue(E e);

    public Node<E> dequeue();
}
