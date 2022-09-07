public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
    }

    private static void task1() {
        char color = 'g';

        if (color == 'r') {
            System.out.println("Красный! Ехать нельзя!");
        } else if (color == 'y') {
            System.out.println("Желтый. Внимание.");
        } else {
            System.out.println("Зеленый! Проезд разрешен.");
        }
    }

    private static void task2() {
        int dayOfWeekNumber = 7;

        switch (dayOfWeekNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
    }
        private static void task3() {
            int dayOfWeekNumber = 3;

            switch (dayOfWeekNumber) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Будний день");
                    break;
                case 6:
                case 7:
                    System.out.println("Выходной день");
                    break;
                default:
                    System.out.println("Такого дня не существует");
            }
        }
    }

