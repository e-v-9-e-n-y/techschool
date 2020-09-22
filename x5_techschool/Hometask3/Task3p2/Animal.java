package Task3p2;

public abstract class Animal {
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    // любимое лакомство животного
    private String food;
    // где живёт животное
    private String location;

    protected abstract String animalKind();

    protected abstract String soundlKind();

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise() {
        System.out.println(animalKind() + " " + soundlKind());
    }

    public void eat() {
        System.out.println(animalKind() + " ест");
    }

    public void sleep() {
        System.out.println(animalKind() + " спит");
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
