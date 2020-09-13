package Task3p2;

public class Dog extends Animal {
    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    protected String animalKind() {
        return "Собака";
    }

    @Override
    protected String soundlKind() {
        return "лает";
    }

    // собака прошла курс дрессировки ?
    private boolean trained;

    // собака умеет сторожить дом ?
    private boolean canGuard;
}
