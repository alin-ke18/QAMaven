public class Game {

    protected boolean isGreenLight;

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
           return speed > 0;
        }

    public void setGreenLight(boolean greenLight) {
        isGreenLight = greenLight;
    }

    public boolean isGreenLight() {
        return isGreenLight;
    }

    public Game(boolean isGreenLight) {
//        System.out.println("Игра началась");
        this.isGreenLight = isGreenLight;
    }
}
