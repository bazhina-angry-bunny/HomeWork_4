public class Main {
    public static void main(String[] args) {

        { System.out.println("Задача №1");
            int clientOS = 0;

            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Неизвестная операционная система.");
            }
        }
        { System.out.println("Задача №2");
            int clientOS = 1;
            int clientDeviceYear = 2011;

            if (clientOS == 0 && clientDeviceYear < 2015) {
            } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Неизвестная операционная система.");
            }
        }
        { System.out.println("Задача №3");
            int year = 1500;
            boolean leapYear = year > 1584;

            if (leapYear) {
                if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
                    System.out.println(year + " год является високосным.");
                } else {
                    System.out.println(year + " год не является високосным.");
                }
            } else {
                System.out.println("Первым високосным годом принято считать 1588, после введения данного понятия в 1584 году.");
            }
        }

        System.out.println("Задача №4");

            int deliveruDisnance = (int) 100.5612f;
            boolean deliveruDisnanceMax = deliveruDisnance <= 100;

            if (deliveruDisnanceMax) {
                if (deliveruDisnance <= 20) {
                    System.out.println("Потребуются 1 сутки для доставки вашей банковской карты.");
                } else if (deliveruDisnance > 20 && deliveruDisnance <= 60) {
                    System.out.println("Потребуются 2 суток для доставки вашей банковской карты.");
                } else if (deliveruDisnance > 60 && deliveruDisnance <= 100) {
                    System.out.println("Потребуются 3 суток для доставки вашей банковской карты.");
                }
            } else {
                System.out.println("Доставки нет.");
                }

        System.out.println("Задача №5");

            int dayOfWeekNumber = 6;

            switch (dayOfWeekNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Значение не известно, проверьте корректность вводимы Вами данных; на Змеле год поделен лишь на 12 месяцев.");
            }
        }
}