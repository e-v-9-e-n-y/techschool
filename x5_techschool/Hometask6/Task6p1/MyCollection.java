package Task6p1;

public abstract class MyCollection<E> {

    // возвращает размер коллекции
    public abstract int size();

    // добавить элемент в коллекцию
    public abstract void add(E item);

    // удаляет элемент по индексу
    public abstract void remove(int index);

    // удаляет элемент
    public abstract void remove(E item);

    // получение элемента по индексу
    public abstract E get(int index);

    // очищает коллекцию
    public abstract void clear();

    // CopyPasted from ArrayList
    protected void rangeCheck(int index) {
        if (index >= size())
            throw new IndexOutOfBoundsException("Index(" + index + ") is out of bounds(" + size() + ")");
    }

}
