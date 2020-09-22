package Task3p2;

public class Dog extends Animal {
    public Dog(String food, String location, boolean trained, boolean canGuard) {
        super(food, location);
        this.trained = trained;
        this.canGuard = canGuard;
    }

    // собака прошла курс дрессировки ?
    private boolean trained;

    // собака умеет сторожить дом ?
    private boolean canGuard;

    @Override
    protected String animalKind() {
        return "Собака";
    }

    @Override
    protected String soundlKind() {
        return "лает";
    }

    public boolean isTrained() {
        return trained;
    }

    public boolean isCanGuard() {
        return canGuard;
    }
}
