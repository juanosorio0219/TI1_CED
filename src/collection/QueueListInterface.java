package collection;

public interface QueueListInterface<E> {
	
	public Node<E> front();

    public void setFront(Node<E> first);

    public void enqueue(E e);

    public Node<E> dequeue();
}
