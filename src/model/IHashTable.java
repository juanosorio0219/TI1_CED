package model;

public interface IHashTable<K, V> {
    public abstract int hash(K key);
    public abstract int insert(K key, V value) throws Exception;
    public abstract void delete(K key) throws Exception;
    public abstract Object search(K key);
    public abstract boolean isEmpty();
    public abstract int size();
}