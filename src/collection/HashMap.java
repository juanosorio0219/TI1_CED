	package collection;

public class HashMap<K, V> {
	
	private NodeToMap<K, V>[] values;

	@SuppressWarnings("unchecked")
	public HashMap() {
		values = new NodeToMap[1000];
	}

	private int h(K key) {
		return key.hashCode() % values.length;
	}

	public void put(K key, V i) {

		// Calculamos el indice donde se debe guardar
		int index = h(key);

		// Creamos el objeto a guardar
		NodeToMap<K, V> nuevoElemento = new NodeToMap<K, V>(key, i);

		// Agregamos al arreglo
		values[index] = nuevoElemento;
	}

	public V get(K key) {
		// Calculamos el indice donde deberia estar guardado
		int index = h(key);

		// Verificamos que se encuentre en la estructura
		if (values[index] != null) {
			// Retornamos lo encontrado
			return values[index].getValue();
		}

		// Si no se encuentra retornamos null
		return null;
	}
}
