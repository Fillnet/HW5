import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        //task6();
        //task7();
        //task8();
    }

    private static void task1() {

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }


    private static void task2() {

        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    private static void task3() {
        int year = 2021;
        boolean leapyear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (leapyear)
            System.out.println("Год " + year + " високосный");
        else
            System.out.println("Год " + year + " не високосный");
    }

    private static void task4() {

        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance > 20) {
            day++;
        }
        if (deliveryDistance > 60) {
            day++;
        }
        System.out.println("Потребуется дней: " + day);
    }
    private static void task5() {
        int month;
        month = 12;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" ОСень");
                break;
            default:
                System.out.println("Некоректный месяц ");

        }

    }
}