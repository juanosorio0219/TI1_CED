package collection;

public class QueueList<E> implements QueueListInterface<E> {

	private Node<E> front;
	private Node<E> back;

	public QueueList() {
		this.front = null;
		this.back = null;
	}
	    
	@Override
	public Node<E> front() {
		return this.front;
	}
	
	@Override
	public void setFront(Node<E> newFront) {
        this.front = newFront;
    }
	
	@Override
	public void enqueue(E e) {
		Node<E> node = new Node<E>(e);
		
		if (front == null) {
			front = node;
			back = node;
		} else {
			back.setNext(node);
			back = node;
		}
	}

	@Override
	public Node<E> dequeue() {
		if (front != null) {
            
			Node<E> dequeueNode = front;
            
            if(front.getNext() == null) {
                front = null;
            } else {
                front = front.getNext();
            }

            return dequeueNode;
            
        } else {
            return null;
        }
	}
	
}
