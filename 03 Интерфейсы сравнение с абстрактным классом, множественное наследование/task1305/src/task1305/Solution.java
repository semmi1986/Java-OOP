package task1305;

/* 
Четыре ошибки
Исправь 4 ошибки в программе, чтобы она компилировалась.


Requirements:
1. У переменных, объявленных в интерфейсе, может быть только самый широкий уровень доступа (public).
2. Унаследоваться (extends) можно только от класса: для реализации интерфейсов используется ключевое слово implements.
3. Класс Hobby должен быть объявлен с модификатором доступа static.
4. Для доступа к переменной HOBBY не нужно создавать объект Dream.
5. Объявления интерфейсов не изменяй.*/

public class Solution {

    public static void main(String[] args) {

        System.out.println(new Dream().HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        static Hobby HOBBY = new Hobby();
    }

    class Hobby extends Desire implements Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
