package task4;

public class ColdControlException extends Exception {
    public  ColdControlException(){
        System.out.println("The device can't work! The temperature is too cold!");

    }
}
