package Task6p2;

import Task6p2.Fruits.Fruit;

import java.util.ArrayList;

public class Box {
    private ArrayList<Fruit> fruits = new ArrayList<>();

    public boolean addFruit(Fruit fruitToAdd) {
        // проверка наличия фруктов, уже имеющихся в коробке
        if (fruits.size() > 0) {
            // сравниваем с первым уже имеющимся в коробке фруктом
            String currClassName = fruits.get(0).getClass().getName();
            String addingClassName = fruitToAdd.getClass().getName();
            if (currClassName.equals(addingClassName)) {
                fruits.add(fruitToAdd);
                return true;
            } else {
                System.out.println("Нельзя складывать в одну колорбку фрукты различных видов:'" + currClassName + "' и '" + addingClassName + "'");
                return false;
            }
        } else {
            // коробка пустая - просто добавляем
            fruits.add(fruitToAdd);
            return true;
        }
    }

    // определение веса текущей коробки
    public double getWeigth() {
        double boxWeigth = 0f;
        for (Fruit fruit : fruits) {
            boxWeigth += fruit.getWeigth();
        }
        return boxWeigth;
    }

    // ф-ция возвращает True – если массы коробок равны и False в противоположном случае.
    public boolean Compare(Box otherBox) {
        return (this.getWeigth() == otherBox.getWeigth());
    }

    public Fruit[] getFruits() {
        Fruit[] result = new Fruit[fruits.size()];
        fruits.toArray(result);
        return result;
    }

    public void clear() {
        this.fruits.clear();
    }

    public boolean MoveFruitsFromBox(Box otherBox) {
        Fruit[] addingFruits = otherBox.getFruits();
        for (Fruit fr : addingFruits) {
            if (addFruit(fr) == false) {
                return false;
            }
        }
        otherBox.clear();
        return true;
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }
}
