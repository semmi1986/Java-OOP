package task1119;

/* 
Четвертая правильная «цепочка наследования»
Расставь правильно «цепочку наследования» в классах: House (дом), Cat (кот), Dog (собака), Car (машина).


Requirements:
1. В классе Solution должен быть public класс House (дом).
2. В классе Solution должен быть public класс Cat (кот).
3. В классе Solution должен быть public класс Dog (собака).
4. В классе Solution должен быть public класс Car (машина).
5. Правильно унаследуй класс House.
6. Правильно унаследуй класс Cat.
7. Правильно унаследуй класс Dog.
8. Правильно унаследуй класс Car.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class House extends Cat {

    }

    public class Cat extends Car {

    }

    public class Car extends Dog {

    }

    public class Dog extends House {

    }
}