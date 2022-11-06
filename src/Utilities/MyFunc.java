package Utilities;

public class MyFunc {

    public static void Wait(int saniye)  {
        try{
            Thread.sleep(saniye*2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}
