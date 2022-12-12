public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" "+firstName+" "+middleName;
        System.out.println("ФИО сотрудника — "+fullName);

        System.out.println("Задача 2");

        String fullNameForTheReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullNameForTheReport);

        System.out.println("Задача 3");

        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace('ё','е');
        String fullNameForSystem =fullName2.replace('Ё', 'е');
        System.out.println("Данные ФИО сотрудника — "+fullNameForSystem);
    }
}