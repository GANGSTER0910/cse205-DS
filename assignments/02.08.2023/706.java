import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyHashMap {
    private List<List<Pair<Integer, Integer>>> mp;
    private int size = 10;

    // Constructor
    public MyHashMap() {
        mp = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            mp.add(new LinkedList<>());
        }
    }

    // Hash function
    private int hash(int key) {
        return key % size;
    }

    // Put method to insert a key-value pair
    public void put(int key, int value) {
        int i = hash(key);
        List<Pair<Integer, Integer>> bucket = mp.get(i);

        for (Pair<Integer, Integer> pair : bucket) {
            if (pair.first.equals(key)) {
                pair.second = value;
                return;
            }
        }

        bucket.add(new Pair<>(key, value));
    }

    // Get method to retrieve the value associated with a key
    public int get(int key) {
        int i = hash(key);
        List<Pair<Integer, Integer>> bucket = mp.get(i);

        for (Pair<Integer, Integer> pair : bucket) {
            if (pair.first.equals(key)) {
                return pair.second;
            }
        }

        return -1;
    }

    // Remove method to delete a key-value pair
    public void remove(int key) {
        int i = hash(key);
        List<Pair<Integer, Integer>> bucket = mp.get(i);

        for (Pair<Integer, Integer> pair : bucket) {
            if (pair.first.equals(key)) {
                bucket.remove(pair);
                return;
            }
        }
    }
}

class Pair<K, V> {
    K first;
    V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }
}