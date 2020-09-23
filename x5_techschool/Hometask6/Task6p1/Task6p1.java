package Task6p1;

import Task6p2.Fruits.Apple;
import Task6p2.Fruits.Fruit;

public class Task6p1 {
    private static void testcollection(MyCollection collectionToTest) {
        System.out.println("Size=" + collectionToTest.size());

        // добавление элементов коллекции
        collectionToTest.add(new Apple("то самое яблоко!"));
        collectionToTest.add(new Apple("другое яблоко..."));
        collectionToTest.add(new Apple("и ещё одно!"));
        Apple apple = new Apple("it's Apple");
        collectionToTest.add(apple);

        // получение кол-ва элеметов в коллекции
        System.out.println("Size=" + collectionToTest.size());
        System.out.println(collectionToTest.toString());

        // пример получения одного их элементов коллекции
        Fruit fruit = (Fruit) collectionToTest.get(2);
        System.out.println("fruit.comment=" + fruit.getComment());

        // поштучное удаление элементов коллекции
        collectionToTest.remove(2);
        System.out.println(collectionToTest.toString());

        collectionToTest.remove(0);
        System.out.println(collectionToTest.toString());

        collectionToTest.remove(apple);
        System.out.println(collectionToTest.toString());

        // очистка коллекции
        collectionToTest.clear();
        System.out.println(collectionToTest.toString());
    }

    public static void main(String[] args) {
        // тест для коллекции на основе массива
        MyArraybasedCollection<Fruit> myCollect1 = new MyArraybasedCollection<Fruit>();
        System.out.println(myCollect1.toString());
        testcollection(myCollect1);

        System.out.println("---------------------------------------------------");

        // тест для коллекции на основе связанного списка
        MyLinkedCollection<Fruit> myCollect2 = new MyLinkedCollection<Fruit>();
        System.out.println(myCollect2.toString());
        testcollection(myCollect2);
    }
}
