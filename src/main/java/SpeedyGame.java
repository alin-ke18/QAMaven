public class SpeedyGame extends Game {

    private int MAXSPEED;

    public SpeedyGame(boolean isGreenLight, int MAXSPEED) {
        super(isGreenLight);
//        System.out.println("Максимальная скорость: " + MAXSPEED);
        this.MAXSPEED = MAXSPEED;
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
