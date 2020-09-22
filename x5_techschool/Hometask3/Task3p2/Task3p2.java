package Task3p2;

public class Task3p2 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Кошка любит есть мышек", "Кошка живёт дома", true);
        animals[1] = new Dog("Собака любит грызть косточки", "Собака живёт в конуре", true, true);
        animals[2] = new Horse("Лошадь любит есть овёс", "Лошадь живёт в конюшне", false);
        Veterinary veterinary = new Veterinary();
        for (int i = 0; i < 3; i++) {
            veterinary.treatAnimal(animals[i]);
        }

        animals[0].eat();
        animals[0].sleep();;
    }
}
