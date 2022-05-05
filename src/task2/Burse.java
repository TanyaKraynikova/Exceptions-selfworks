/*
//Возникла проблема с доступом. Не могу достучаться до int[]burse
//А если делаю int[]burse статическим , то он по дефолту заполняется нулями

package task2;
import java.util.Scanner;

public class Burse {


    public static void main(String[] args) {

        int[] burse = new int[5];

        System.out.println("Burse price within 5 days : ");
        for (int i = 0; i < burse.length; i++) {
            burse[i] = ((int) (Math.random() * 1000));
            System.out.println(burse[i]);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day number : ");
        int num = in.nextInt();

        try {
        // Код, который может вызвать исключение
            day(num);

        } catch (ArrayIndexOutOfBoundsException e) {
        // Обработка исключения
            System.out.println("Wrong number!");
        }
    }

    public static void day(int num) {
        if (num <= 5) {
            switch (num) {
                case 1:
                    System.out.println("The price of the goods on the first day on the burse :" + burse[0]);
                    break;
                case 2:
                    System.out.println("The price of the goods on the second day on the burse :" + burse[1]);
                    break;
                case 3:
                    System.out.println("The price of the goods on the third day on the burse :" + burse[2]);
                    break;
                case 4:
                    System.out.println("The price of the goods on the fourth day on the burse :" + burse[3]);
                    break;
                case 5:
                    System.out.println("The price of the goods on the fifth day on the burse :" + burse[4]);
                    break;
            }
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}

*/