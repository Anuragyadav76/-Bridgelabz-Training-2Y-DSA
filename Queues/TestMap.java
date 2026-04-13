import java.util.*;

class MyHashMap {
    int SIZE = 10;
    LinkedList<int[]>[] table;

    MyHashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    int hash(int key) {
        return key % SIZE;
    }

    void put(int key, int value) {
        int index = hash(key);
        for (int[] pair : table[index]) {
            if (pair[0] == key) {
                pair[1] = value;
                return;
            }
        }
        table[index].add(new int[]{key, value});
    }

    int get(int key) {
        int index = hash(key);
        for (int[] pair : table[index]) {
            if (pair[0] == key) return pair[1];
        }
        return -1;
    }
}

public class TestMap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 100);
        map.put(2, 200);

        System.out.println(map.get(1));
    }
}