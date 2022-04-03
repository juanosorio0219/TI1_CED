package collection;

public class StackList<E> implements StackListInterface<E> {
	
	private Node<E> top;
	
	public StackList() {
        this.top = null;
    } 
	
	@Override
	public void push(E value) {
		Node<E> node = new Node<>(value);
		
		if (top == null) {
            top = node;
        } else {
            node.setPrevious(top);
            top = node;
        }
	}

	@Override
	public Node<E> pop() {
		Node<E> temp = top;
        
		if (top.getPrevious() != null) {
            top = top.getPrevious();
        } else {
            top = null;
        }
        return temp;
	}

	@Override
	public E top() {
		  return top.getItem();
	}

}
