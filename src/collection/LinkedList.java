package collection;
import collection.Node;

public final class LinkedList<E> implements LinkedListInterface<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
	
	public Node<E> getHead() {
		return head;	
	}
	
	public Node<E> getTail() {
		return tail;
	}
	
	public int size() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean isEmpty() {
		return (head == null) ? true : false;
	}
	
	public void add(E e) {
		if(isEmpty()) {
            head = new Node<E>(e);
            tail = head;
        } else {
            add(e, tail, 0);
        }
        
		size++;
	}

	
	private void add(E e, Node<E> temp, int counter) {
		if(counter == 0) {
            temp.setNext(new Node<E>(e));
            temp.getNext().setPrevious(temp);
            tail = temp.getNext();
            counter += 1;
        }

        if(temp.getPrevious() != null && counter == 1) {
            add(e, temp.getPrevious(), counter);
            
        }else {
            head = temp;
        }
    }

	
	public E get(int index) {
		return getE(index, head);
	}

	private E getE(int index, Node<E> temp) {
        
		if (index == 0) {
            return temp.getItem();

        } else {
            return getE(index - 1, temp.getNext());
        }
    }
	
	
	public Node<E> getNode(int index) {
        return getNode(index, head);
    }

    private Node<E> getNode(int index, Node<E> temp) {
    	
    	if (index == 0) {
            return temp;

        } else {
            return getNode(index - 1, temp.getNext());
        }

    }
    
}
