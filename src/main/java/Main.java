import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] speed = {3, 65, 60};
//        Max.setIsGreenLight(false);
//        Max.getIsGreenLight();
//        Max.numberOfGetOut(speed);
//        Arrays.toString(Max.toKnowSpeedOut(speed));
//        Max.toKnowStayIn(speed);
        String[] players = {"Katya 13", "Sveta 64", "Igor 2"};
//        Max.PlayersNameStayedInGame(players);
        Max max = new Max(true);
        max.PlayersNameStayedInGame(players);
    }
}
