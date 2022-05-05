package task4;
import java.util.Scanner;

public class RemoteControl {
    public static void main(String[] args) throws ColdControlException, HotControlException {

        System.out.println("Enter the temperature for the device : ");
        Scanner in = new Scanner(System.in);
        double temp = in.nextDouble();

        if(temp < -10) {
            throw new ColdControlException();
        }

        else if (temp > +35){
            throw new HotControlException();
        }
        else{
            System.out.println("Correct working  of the device!");
        }
    }
}
