package task1;
import java.util.Scanner;

public class NumFE {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input number : ");

        try {
            // Код, который может вызвать исключение
            double num = Double.parseDouble(in.nextLine());
            System.out.println("Your number  : " + num);

        } catch (NumberFormatException e) {
            // Обработка исключения
            System.out.println("Not a number!");
        }
    }
}
