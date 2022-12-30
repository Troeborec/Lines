public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
    public static void task1() {
        System.out.println("Задача №1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = "Ivanov " + "Ivan " + "Ivanovich ";
        String fullName2 = lastName + " " + firstName + " " + middleName + " ";
        System.out.println("ФИО сотрудника - " + fullName2);

        }
        public static void  task2() {
            System.out.println("Задача №2");
            String fullName = "Ivanov " + "Ivan " + "Ivanovich ";
            String fullNameBig = fullName.toUpperCase();
            System.out.println("Данные ФИО сотдурника для заполнения отчета - " + fullNameBig);
        }
        public static void task3() {
            System.out.println("Задача №3");
            String fullName = "Иванов " + "Семён " + "Семёнович ";
            fullName = fullName.replace("ё", "е");
            System.out.println(fullName);
        }
    }