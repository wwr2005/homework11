import java.time.LocalDate;

 public class Main {

     public static void main(String[] args) {
         System.out.println("Задача №1");
         printInfoAboutYear(2023);
         System.out.println(" ");
         System.out.println("Задача №2");
         printInfoAboutVersion(0, 2023);
         int DeliveryDays = calculateDeliveryDays(95);
                 if (DeliveryDays > 0) {
                     System.out.println("Потребуется дней: " + DeliveryDays);
                 } else {
                     System.out.println("Доставки нет!");
                 }
     }

     private static void printInfoAboutYear(int year) {
         if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
             System.out.println("год — " + year + "високосный год");
         } else {
             System.out.println("год — " + year + " Не високосный год");
         }
     }

     private static void printInfoAboutVersion(int os, int deviceYear) {
         if (os != 0 && os != 1) {
             System.out.println("Некоректная os!");
             return;
         }
         int currentYear = LocalDate.now().getYear();
         StringBuilder stringBuilder = new StringBuilder("Установите ");
         if (deviceYear < currentYear) {
             stringBuilder.append("облегченную");
         }
         stringBuilder.append(" версию приложения для");
         if (os == 0) {
             stringBuilder.append(" IOS");
         } else {
             stringBuilder.append(" Android");
         }
         stringBuilder.append(" по ссылке");
         System.out.println(stringBuilder);
     }

     private static int calculateDeliveryDays(int distance) {
         if (distance < 0 || distance > 100) {
             return 0;
         }
int days = 1;
         if (distance > 20) {
             days++;
         }
         if (distance > 60) {
             days++;
         }
         return days;
     }
    }
