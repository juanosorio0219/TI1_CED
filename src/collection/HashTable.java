package collection;

import java.util.Objects;


public class HashTable<K, V> implements HashTableInterface<K, V> {

    private HashNodeToMap<?, ?>[] table;
    private int size;
    private int arraySize;

    public HashTable(int arraySize) {
    	this.arraySize = arraySize;
    	
    	table = new HashNodeToMap<?, ?>[arraySize];
        size = 0; 
    }

	@Override
	public int hash(K key) {
		return Objects.hashCode(key) % arraySize;
	}
	
	public int hash(K key, int i) {
		return (Objects.hashCode(key) + i) % arraySize;
	}
	   

	@Override
	public int put(K key, V value) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Object search(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(K key) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
