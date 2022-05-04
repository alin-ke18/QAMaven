public class SpeedyGame extends Game {

    private int MAXSPEED;

    public SpeedyGame(boolean isGreenLight, int MAXSPEED) {
        super(isGreenLight);
//        System.out.println("Максимальная скорость: " + MAXSPEED);
        this.MAXSPEED = MAXSPEED;
    }

        @Override
    public boolean isFailed(int speed) {

            if (isGreenLight) {
//            System.out.println("Остался");
                return false;
            } else
//            if (speed >0) {
////                System.out.println("Выбыл");
//            }
//            if (speed == 0) {
////                System.out.println("Остался");
//            }
                return speed > MAXSPEED;
    }
    public int getMAXSPEED() {
//        System.out.println("Максимальная скорость: " + MAXSPEED);
        return MAXSPEED;
    }
    public void setMAXSPEED(int MAXSPEED) {
//        System.out.println("Максимальная скорость изменена на: " + MAXSPEED + "\nТеперь ");
        this.MAXSPEED = MAXSPEED;
    }
}
