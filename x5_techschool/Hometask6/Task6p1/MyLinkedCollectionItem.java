package Task6p1;

public class MyLinkedCollectionItem {
    public MyLinkedCollectionItem(Object item, MyLinkedCollectionItem prevItem, MyLinkedCollectionItem nextItem) {
        this.item = item;
        this.prevItem = prevItem;
        this.nextItem = nextItem;
    }

    private Object item;
    private MyLinkedCollectionItem prevItem;
    private MyLinkedCollectionItem nextItem;

    public MyLinkedCollectionItem getPrevItem() {
        return prevItem;
    }

    public void setPrevItem(MyLinkedCollectionItem prevItem) {
        this.prevItem = prevItem;
    }

    public MyLinkedCollectionItem getNextItem() {
        return nextItem;
    }

    public void setNextItem(MyLinkedCollectionItem nextItem) {
        this.nextItem = nextItem;
    }

    @Override
    public String toString() {
        return "MyLinkedCollectionItem{" +
                "item=" + item +
                '}';
    }

    public Object getItem() {
        return item;
    }
}
