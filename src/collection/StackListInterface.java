package collection;

public interface StackListInterface<E> {
	
	public void push(E value);

    public Node<E> pop();

    public E top();

}
