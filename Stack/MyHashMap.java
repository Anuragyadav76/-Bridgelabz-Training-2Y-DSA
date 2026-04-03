class MyHashMap {

    class Node {
        int key, value;
        Node next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    int SIZE = 10;
    Node[] table = new Node[SIZE];

    int hash(int key) {
        return key % SIZE;
    }

    void put(int key, int value) {

        int index = hash(key);

        Node newNode = new Node(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node temp = table[index];
            while (temp.next != null)
                temp = temp.next;

            temp.next = newNode;
        }
    }

    void get(int key) {

        int index = hash(key);

        Node temp = table[index];

        while (temp != null) {

            if (temp.key == key) {
                System.out.println("Value = " + temp.value);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();

        map.put(1, 100);
        map.put(11, 200);

        map.get(11);
    }
}
