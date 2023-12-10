import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("Задача №1.");
        String firstName = "Aleksey";
        String middleName = "Sergeevich";
        String lastNAme = "Mostolygin";
        String fullName = lastNAme + " " + firstName + " " + middleName;
        System.out.println(fullName);
    }
    private static void task2() {
        System.out.println("Задача №2.");
        String firstName = "Aleksey";
        String middleName = "Sergeevich";
        String lastNAme = "Mostolygin";
        String fullName = lastNAme + " " + firstName + " " + middleName;
        System.out.println(fullName.toUpperCase());
    }
    private static void task3() {
        System.out.println("Задача №3.");
        String firstName = "ЁСемён";
        String middleName = "Семёнович";
        String lastNAme = "Иванов";
        String fullName = lastNAme + " " + firstName + " " + middleName;
        fullName = fullName.replace("ё", "е");
        fullName = fullName.replace("Ё", "Е");
        System.out.println(fullName);
        System.out.println("как написать проще замена Ё, ё на Е, е?");
    }

}