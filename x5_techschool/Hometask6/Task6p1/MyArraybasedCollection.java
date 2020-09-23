package Task6p1;

import java.util.Arrays;

public class MyArraybasedCollection<E> extends MyCollection<E> {
    private static final int MAX_ARRAY_SIZE = 10;
    private Object[] items;

    private void ShiftLeft(int index) {
        for (int i = index + 1; i < this.items.length; i++) {
            items[i - 1] = items[i];
        }
        items = Arrays.copyOf(items, items.length - 1);
    }

    @Override
    public int size() {
        if (this.items == null) {
            return 0;
        } else {
            return this.items.length;
        }
    }

    // добавить элемент в коллекцию
    @Override
    public void add(E item) {
        if (this.items == null) {
            this.items = new Object[1];
        } else {
            this.items = Arrays.copyOf(items, size() + 1);
        }
        this.items[size() - 1] = item;
    }

    // удаляет элемент по индексу
    @Override
    public void remove(int index) {
        rangeCheck(index);

        ShiftLeft(index);
    }

    //  удаляет элемент
    @Override
    public void remove(E item) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].equals(item)) {
                remove(i);
                break;
            }
        }
    }

    //  получение элемента по индексу
    @Override
    public E get(int index) {
        rangeCheck(index);

        return (E) items[index];
    }

    //  очищает коллекцию
    @Override
    public void clear() {
        this.items = null;
    }

    public MyArraybasedCollection() {
    }

    @Override
    public String toString() {
        return "MyArraybasedCollection{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
