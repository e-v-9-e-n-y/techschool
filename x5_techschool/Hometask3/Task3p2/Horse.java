package Task3p2;

public class Horse extends Animal {
    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    protected String animalKind() {
        return "Лошадь";
    }

    @Override
    protected String soundlKind() {
        return "ржёт";
    }

    // может перевозить груз (не пони)
    private boolean canTransportingCargo;
}
