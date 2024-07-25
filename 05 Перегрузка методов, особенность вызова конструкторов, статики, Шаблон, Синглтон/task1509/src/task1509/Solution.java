package task1509;

/* 
Мужчина или женщина?
Измени метод printName() так, чтобы он выполнялся для man и woman.
Реализация метода printName() должна быть одна.


Requirements:
1. В классе Solution должен быть реализован только один метод printName().
2. Метод printName() должен принимать один параметр типа Human.
3. Класс Man должен быть потомком класса Human.
4. Класс Woman должен быть потомком класса Human.*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Man man) {

    }

    public static class Human {

    }

    public static class Man {

    }

    public static class Woman {

    }
}
