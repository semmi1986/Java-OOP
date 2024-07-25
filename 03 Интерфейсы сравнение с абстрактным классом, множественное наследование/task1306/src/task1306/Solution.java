package task1306;

/* 
Баг в initializeIdAndName
Посмотри на программу и исправь ее, чтобы она компилировалась и работала:
Вынеси реализацию метода initializeIdAndName в класс User.
Сделай так, чтобы initializeIdAndName в классе User возвращал тип User.

Requirements:
1. Интерфейс DBObject должен содержать только объявление метода initializeIdAndName без реализации.
2. Реализуй метод initializeIdAndName в классе User.
3. Метод initializeIdAndName в классе User должен иметь тип возвращаемого значения User.
4. Метод initializeIdAndName должен присваивать значения полям id и name объекта типа User в соответствии с переданными ему параметрами и возвращать этот объект.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }
    }

}
