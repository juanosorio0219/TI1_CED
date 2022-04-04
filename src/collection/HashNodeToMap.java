package collection;

public class HashNodeToMap<K, V> {
	K key;
	V value;

	HashNodeToMap<K, V> next;
	HashNodeToMap<K, V> prev;

	public HashNodeToMap(K key, V value) {
		this.key = key;
		this.value = value;

		next = null;
		prev = null;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}
