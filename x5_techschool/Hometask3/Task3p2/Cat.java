package Task3p2;

public class Cat extends Animal {
    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    protected String animalKind() {
        return "Кошка";
    }

    @Override
    protected String soundlKind() {
        return "мяукает";
    }

    // умеет ли кошка ловить мышей
    private boolean  canCatchMice;
}
