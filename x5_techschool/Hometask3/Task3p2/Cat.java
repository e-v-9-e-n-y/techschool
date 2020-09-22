package Task3p2;

public class Cat extends Animal {
    public Cat(String food, String location, boolean canCatchMice) {
        super(food, location);
        this.canCatchMice = canCatchMice;
    }

    // умеет ли кошка ловить мышей
    private boolean canCatchMice;

    @Override
    protected String animalKind() {
        return "Кошка";
    }

    @Override
    protected String soundlKind() {
        return "мяукает";
    }

    public boolean isCanCatchMice() {
        return canCatchMice;
    }
}
