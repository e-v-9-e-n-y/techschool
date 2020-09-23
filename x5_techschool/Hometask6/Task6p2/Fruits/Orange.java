package Task6p2.Fruits;

public class Orange extends Fruit {

    public Orange(int qty, float weigthPerPiece, String comment) {
        super(qty, weigthPerPiece, comment);
    }

    public Orange(String comment) {
        super(comment);
    }

    @Override
    protected float getDefaultWeigthPerPiece() {
        return 1.5f;
    }
}
