package task4;

public class HotControlException extends Exception {
    public HotControlException(){
        System.out.println("The device can't work! The temperature is too hot!!");
    }
}
