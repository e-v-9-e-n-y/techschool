package Task6p2;

import Task6p2.Fruits.Apple;
import Task6p2.Fruits.Fruit;
import Task6p2.Fruits.Orange;

public class Task6p2 {

    public static void main(String[] args) {
        // коробки для апельсинов
        Box boxForOranges1 = new Box();
        Box boxForOranges2 = new Box();

        // коробки для яблок
        Box boxForApples1 = new Box();
        Box boxForApples2 = new Box();

        int n = 6;
        for (int i = 1; i < n; i++) {
            // добавление апельсинов в коробки
            boxForOranges1.addFruit(new Orange("orange" + i));
            boxForOranges2.addFruit(new Orange("orange" + (i + n)));

            // добавление апельсинов в коробки
            boxForApples1.addFruit(new Apple("apple" + i));
            boxForApples2.addFruit(new Apple("apple" + (i + n)));
        }

        // вывод на печать
        System.out.println("Заполненные коробки:");
        System.out.println(boxForOranges1.toString());
        System.out.println(boxForOranges2.toString());
        System.out.println(boxForApples1.toString());
        System.out.println(boxForApples2.toString());

        // пересыпание апельсинов между коробками
        System.out.println("Пересыпание апельсинов между коробками:");
        boxForOranges1.MoveFruitsFromBox(boxForOranges2);
        System.out.println(boxForOranges1.toString());
        System.out.println(boxForOranges2.toString());

        // пересыпание яблок к апельсинам (пересорт)
        System.out.println("Пересыпание яблок к апельсинам (пересорт):");
        boxForOranges1.MoveFruitsFromBox(boxForApples1);
        System.out.println(boxForOranges1.toString());
        System.out.println(boxForApples1.toString());

        // поштучное добавление пересорта
        System.out.println("Поштучное добавление пересорта:");
        Apple apple = new Apple("it's Apple");
        boxForOranges1.addFruit(apple);
        System.out.println(boxForOranges1.toString());

        // поштучное добавление пересорта в пустую коробку
        System.out.println("Поштучное добавление пересорта в пустую коробку:");
        System.out.println(boxForOranges2.toString());
        boxForOranges2.addFruit(apple);
        System.out.println(boxForOranges2.toString());

        // вывод веса коробок
        System.out.println("Вес коробки boxForOranges1:" + boxForOranges1.getWeigth());
        System.out.println("Вес коробки boxForOranges2:" + boxForOranges2.getWeigth());
        System.out.println("Вес коробки boxForApples1:" + boxForApples1.getWeigth());
        System.out.println("Вес коробки boxForApples2:" + boxForApples2.getWeigth());
    }
}
