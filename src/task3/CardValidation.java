package task3;
import java.util.Scanner;

public class CardValidation {
    //Денежные средства на карте
    static double account = 1000;

    public static void main(String[] args) {

        System.out.println("Your account balance : "+ account);
        Scanner in = new Scanner(System.in);
        //Ввод стоимости товара
        System.out.println("Enter cost item :");
        double cost = in.nextDouble();

        try {
            // Код, который может вызвать исключение
            // Вызов метода
            validateAccount(account, cost);
        } catch (Exception e) {
            // Обработка исключения
            System.out.println("Sorry you don't have enough money:(");
        }
    }

    //Метод валидации достаточного наличия
    //денежных средств на карте при оплате товара
    static void validateAccount(double account, double cost) throws Exception {

        if (cost <= account) {
            System.out.println("Good product purchase!");

            double account_balance = account - cost;
            System.out.println("Current account balance : " + account_balance);

        } else {
            throw new Exception();
        }
    }
}
