package Task6p1;

public class MyLinkedCollection<E> extends MyCollection<E> {
    private int count;
    private MyLinkedCollectionItem firstItem;
    private MyLinkedCollectionItem lastItem;

    public MyLinkedCollection() {
        this.count = 0;
        this.firstItem = null;
        this.lastItem = null;
    }

    // возвращает размер коллекции
    @Override
    public int size() {
        return count;
    }

    // добавить элемент в коллекцию
    @Override
    public void add(E item) {
        if (firstItem == null) {
            // элеметов нет. добавляем первым
            firstItem = new MyLinkedCollectionItem(item, null, null);
            this.lastItem = firstItem;
        } else {
            // добавляем элемент последним
            MyLinkedCollectionItem newLinkedItem = new MyLinkedCollectionItem(item, this.lastItem, null);
            this.lastItem.setNextItem(newLinkedItem);
            this.lastItem = newLinkedItem;
        }
        this.count += 1;
    }

    // удаляет элемент по индексу
    @Override
    public void remove(int index) {
        rangeCheck(index);

        MyLinkedCollectionItem item = firstItem;
        int num = 0;
        while (item != null) {
            if (num == index) {
                doRemove(item);
                return;
            }
            num += 1;
            item = item.getNextItem();
        }
    }

    // удаляет элемент
    @Override
    public void remove(E item) {
        MyLinkedCollectionItem collectionItem = firstItem;
        while (collectionItem != null) {
            if (collectionItem.getItem().equals(item)) {
                doRemove(collectionItem);
                return;
            }
            collectionItem = collectionItem.getNextItem();
        }
    }

    // получение элемента по индексу
    @Override
    public E get(int index) {
        MyLinkedCollectionItem item = firstItem;
        int num = 0;
        while (item != null) {
            if (num == index) {
                return (E) item.getItem();
            }
            num += 1;
            item = item.getNextItem();
        }
        return null;
    }

    // очищает коллекцию
    @Override
    public void clear() {
        while (this.lastItem != null) {
            doRemove(this.lastItem);
        }
    }

    private void doRemove(MyLinkedCollectionItem item) {
        // для случаев, когда удаляем первый или последний элемент
        if (this.firstItem == item) {
            this.firstItem = item.getNextItem();
        }
        if (this.lastItem == item) {
            this.lastItem = item.getPrevItem();
        }

        MyLinkedCollectionItem prevItem = item.getPrevItem();
        if (prevItem != null) {
            prevItem.setNextItem(item.getNextItem());
        }

        MyLinkedCollectionItem nextItem = item.getNextItem();
        if (nextItem != null) {
            nextItem.setPrevItem(item.getPrevItem());
        }
        count -= 1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        MyLinkedCollectionItem item = firstItem;
        while (item != null) {
            stringBuilder.append(item.toString());
            item = item.getNextItem();
        }
        return "MyLinkedCollection{" +
                "count=" + count +
                "; Items=" + stringBuilder.toString() +
                '}';
    }
}
