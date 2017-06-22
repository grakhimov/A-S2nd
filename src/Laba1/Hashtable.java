package Laba1;

/**
 * Выполнено при помощи линейного списка
 * У каждого индекса может быть несколько значений
 */
class HashTable {

    public int size;
    public Pair[][] pairs;
    public char name;

    public HashTable(int size, char name) {
        this.size = size;
        this.name = name;
        pairs = new Pair[size * 2][size];
        for (int i = 0; i < size * 2; i++) {
            for (int j = 0; j < size; j++) {
                pairs[i][j] = new Pair(-1, ' ');
            }
        }
    }

    public char getName() {
        return this.name;
    }

    public void add(int key, char data) {
        int index = hash(key);
        for (int j = 0; j < size; j++) {
            Pair pair = pairs[index][j];
            if (pair.key == -1) {
                pairs[index][j] = new Pair(key, data);
                break;
            }
        }
    }

    public int hash(int key) {
        return (((size - 1) * key) + 2) % size;
    }

    public void print() {
        for (int index = 0; index < size * 2; index++) {
            if (pairs[index][0].key != -1) {
                System.out.print("[" + index + "] = ");
                for (int j = 0; j < size; j++) {
                    if (pairs[index][j].key != -1) {
                        System.out.print(pairs[index][j].key + "(" + pairs[index][j].data + ")" + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    public boolean contains(Pair pair) {
        for (int i = 0; i < size * 2; i++) {
            for (int j = 0; j < size; j++) {
                if (pairs[i][j].key == pair.key && pair.key != -1) {
                    return true;
                }
            }
        }
        return false;
    }
}