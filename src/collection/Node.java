package collection;

public class Node<E> {
	
	private Node<E> next;
	private Node<E> previous;
	private E item;
	
	public Node(E item) {
		this.next = null;
        this.previous = null;
		this.item = item;     
	}
	
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	public Node<E> getPrevious() {
		return previous;
	}
	public void setPrevious(Node<E> previous) {
		this.previous = previous;
	}
	
	public E getItem() {
		return item;
	}
	public void setItem(E item) {
		this.item = item;
	}
	
	@Override
    public String toString() {
        return getItem() +" ";
    }
}
