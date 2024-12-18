import java.util.Scanner;
import java.util.InputMismatchException;

public class MyMaxOfThreeNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int num1 = 0, num2 = 0, num3 = 0;
            boolean validInput = false;

            // Ввод первого числа
            while (!validInput) {
                try {
                    System.out.println("Введи первое число:");
                    num1 = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: ты ввёл не число! Пожалуйста, введи число.");
                    scanner.next(); // Очищаем буфер сканера
                }
            }

            validInput = false; // Сбрасываем флаг для следующего ввода

            // Ввод второго числа
            while (!validInput) {
                try {
                    System.out.println("Введи второе число:");
                    num2 = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: ты ввёл не число! Пожалуйста, введи число.");
                    scanner.next(); // Очищаем буфер сканера
                }
            }

            validInput = false; // Сбрасываем флаг для следующего ввода

            // Ввод третьего числа
            while (!validInput) {
                try {
                    System.out.println("Введи третье число:");
                    num3 = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: ты ввёл не число! Пожалуйста, введи число.");
                    scanner.next(); // Очищаем буфер сканера
                }
            }

            // Находим максимальное число
            int max = num1; // Предполагаем, что первое число максимальное

            if (num2 > max) {
                max = num2; // Если второе число больше, обновляем max
            }

            if (num3 > max) {
                max = num3; // Если третье число больше, обновляем max
            }

            System.out.println("Максимальное число: " + max);

            scanner.close();
        }
    }
