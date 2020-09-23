package Task6p2.Fruits;

public class Apple extends Fruit {

    public Apple(int qty, float weigthPerPiece, String comment) {
        super(qty, weigthPerPiece, comment);
    }

    public Apple(String comment) {
        super(comment);
    }

    @Override
    protected float getDefaultWeigthPerPiece() {
        return 1.0f;
    }
}
