package Task3p2;

public abstract class Animal {
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    // любимое лакомство животного
    protected String food;
    // где живёт животное
    protected String location;

    protected abstract String animalKind();

    protected abstract String soundlKind();

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
