package Task3p2;

public class Horse extends Animal {
    public Horse(String food, String location, boolean canTransportingCargo) {
        super(food, location);
        this.canTransportingCargo = canTransportingCargo;
    }

    // может перевозить груз (не пони)
    private boolean canTransportingCargo;

    @Override
    protected String animalKind() {
        return "Лошадь";
    }

    @Override
    protected String soundlKind() {
        return "ржёт";
    }
}
