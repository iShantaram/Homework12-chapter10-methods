import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3();
    }

    public static void doTask1() {
        System.out.println("\nTask 1:");
        int year = 2000;
        isLeapYear(year);
    }

    public static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный");
        } else {
            System.out.println(year + " - не високосный");
        }
    }

    public static void doTask2() {
        System.out.println("\nTask 2:");
        int yearPhone = 2021;
        int typeOS = 1; // 0 - iOS, 1 - Android
        printMessage(yearPhone, typeOS);
    }

    public static void printMessage(int yearPhone, int typeOS) {
        String additionalWord = "";
        String typeUserOS = "iOS";
        if (typeOS == 1) {
            typeUserOS = "Android";
        }
        if (typeOS != 1 && typeOS != 0) {
            throw new RuntimeException("Указан не верный параметр для OS телефона");
        }
        if (yearPhone < LocalDate.now().getYear()) {
            additionalWord += "облегченную ";
        }
        System.out.println("Установите " + additionalWord + "версию приложения для " + typeUserOS);
    }

    public static void doTask3() {
        System.out.println("\nTask 3:");
        int deliveryDistance = 95;
        System.out.println("Время доставки (дней): " + calculateDays(deliveryDistance));
    }

    public static int calculateDays(int distance) {
        if (distance > 100) {
            throw new RuntimeException("Слишком большое расстояние для доставки");
        }
        if (distance < 0) {
            throw new RuntimeException("Указана не корректная информация");
        }
        if (distance > 60) {
            return 3;
        }
        if (distance > 20) {
            return 2;
        } else {
            return 1;
        }
    }
}