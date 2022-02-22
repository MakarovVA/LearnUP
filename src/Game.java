public class Game {
    static boolean isGreenLight = false;

    public static boolean checkDropout(int speed) {
        boolean isPlayerOut;

        if (isGreenLight) {
            isPlayerOut = false;
        } else {
            isPlayerOut = speed != 0;
        }


        return isPlayerOut;
    }
}
