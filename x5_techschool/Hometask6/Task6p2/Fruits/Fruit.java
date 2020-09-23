package Task6p2.Fruits;

// т.к. в задании отсутствовали чёткие критерии для класса фруктов и не ясно требуется ли их отличать,
// то в данной реализации данный класс символизирует некоторый "квант фруктов" определённого вида с возможность идентификации
// конкретного кванта по полю "комментарий"
public abstract class Fruit {
    // конструктор с возможность задания всех параметров "кванта"
    public Fruit(int qty, float weigthPerPiece, String comment) {
        this.qty = qty;
        this.weigthPerPiece = weigthPerPiece;
        this.comment = comment;
    }

    // упрощённый конструктор для случая если в кванте 1 шт и вес по-умолчанию
    public Fruit(String comment) {
        this.comment = comment;
        this.qty = 1;
        this.weigthPerPiece = getDefaultWeigthPerPiece();
    }

    private int qty; // кол-во в кванте, по-умолчанию 1 шт.
    private float weigthPerPiece; // вес 1 шт, может быть передан явно в контруктор при создании экземпляра, иначе подтянется по-умолчанию в зависимости от класса фрукта
    private String comment; // комментарий для возможности отличить один фрукт от другого такого же  фрукта того же класса

    // усреднённый вес 1 шт. по-умолчанию
    protected abstract float getDefaultWeigthPerPiece();

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getWeigth() {
        return weigthPerPiece * qty;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "qty=" + qty +
                ", weigthPerPiece=" + weigthPerPiece +
                ", comment='" + comment + '\'' +
                '}';
    }
}
