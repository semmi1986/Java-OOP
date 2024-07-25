package task1310;

/* 
Будущий управленец
Добавь интерфейсы Secretary и Boss к классам Manager и Subordinate. По одному на каждый. Подумай, кому какой.
Унаследуй интерфейсы Secretary и Boss от интерфейсов Person и HasManagementPotential так, чтобы все методы у классов Manager и Subordinate были объявлены в каком-то интерфейсе.


Requirements:
1. Класс Manager должен реализовывать подходящий ему интерфейс (Secretary или Boss).
2. Класс Subordinate должен реализовывать подходящий ему интерфейс (Secretary или Boss).
3. Секретарь (Secretary) является человеком (Person).
4. Начальник (Boss) является человеком (Person), который может заставить других усердно работать (HasManagementPotential).*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary {
    }

    interface Boss {
    }

    class Manager {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}
