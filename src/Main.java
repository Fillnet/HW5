import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //task5();
        //task6();
        //task7();
        //task8();
    }

    private static void task1() {

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else if (clientOS == 1) {
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

        //  int deliveryDistance = 95;
        //  int day = 1;
        //  if (deliveryDistance > 20) {
        //     day = (deliveryDistance / 40) + day;
        //  }
        //  System.out.println("Потребуется дней : " + day);   было бы интересно понять как сделать через Math.round но пока не знаю как)

        int day, nextDay, deliveryDistance, interval;
        day = 1;
        interval = 40;
        deliveryDistance = 101;
        nextDay = deliveryDistance / interval;
        boolean nextDay1 = (nextDay != 0 && nextDay != 1);
        if (deliveryDistance < 20) {
            System.out.println(day);
        }
        if (nextDay1)
            nextDay = nextDay + 1;
        else nextDay = nextDay + 2;

        System.out.println(nextDay);

    }
}



