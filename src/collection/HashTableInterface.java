package collection;

public interface HashTableInterface<K, V> {
    
	public int hash(K key);
    
    public int put(K key, V value) throws Exception;

    //public Object search(K key);

    public int size();
}
