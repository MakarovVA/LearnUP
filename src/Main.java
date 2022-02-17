class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 0;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 0;
        int numberOfDropouts = 0;

        if (isGreenLight) {
            numberOfDropouts = 0;
        } else {
            if (speedOfPlayer1 != 0) {
                numberOfDropouts += 1;
            }
            if (speedOfPlayer2 != 0) {
                numberOfDropouts += 1;
            }
            if (speedOfPlayer3 != 0) {
                numberOfDropouts += 1;
            }


        }
        System.out.println("Количество выбывших = " + numberOfDropouts);
    }
}

// Допишите здесь логику так, что будет подсчитано и выведено
// количество игроков, которые выбывают.
// Если свет зелёный, то проходят все игроки (0 выбывают).
// Если свет красный, то выбывает каждый, чья скорость не 0.