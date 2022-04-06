public class ArrayListInt {
    private int[] data;

    public ArrayListInt() {
        data = new int[0];
    }

    public int size() {
        return data.length;
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int element) {
        data[index] = element;
    }

    public void add(int element) {
        int size = size();
        int[] temp = new int[size + 1];
        for (int i = 0; i < size; ++i) {
            temp[i] = data[i];
        }
        temp[size] = element;
        data = temp;
    }

    public void add(int index, int element) {
        int size = size();
        int[] temp = new int[size + 1];
        for (int i = 0; i < index; ++i) {
            temp[i] = data[i];
        }
        for (int i = 0; i < size; ++i) {
            temp[i + 1] = data[i];
        }
        temp[index] = element;
        data = temp;
    }

    public void remove(int index) {
        int size = size();
        int[] temp = new int[size - 1];
        for (int i = 0; i < index; ++i) {
            temp[i] = data[i];
        }
        for (int i = index + 1; i < size; ++i) {
            temp[i - 1] = data[i];
        }
        data = temp;
    }

    public String toString() {
        String res = "[";
        int size = size();
        for (int i = 0; i < size; i++) {
            res += data[i] + (i < size - 1 ? ", " : "]");
        }
        return res;
    }
}