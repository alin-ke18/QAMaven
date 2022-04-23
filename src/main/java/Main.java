import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] speed = {3, 65, 60};
//        Max.setIsGreenLight(false);
//        Max.getIsGreenLight();
//        Max.numberOfGetOut(speed);
//        Arrays.toString(Max.toKnowSpeedOut(speed));
//        Max.toKnowStayIn(speed);
//        String[] players = {"Katya 13", "Sveta 64", "Igor 2"};
////        Max.PlayersNameStayedInGame(players);
//        Max max = new Max(true);
//        max.PlayersNameStayedInGame(players);
        Game game = new Game(false);
//        game.isFailed(8);
//        SpeedyGame game1 = new SpeedyGame(false, 60);
//        game1.getMAXSPEED();
//        game1.setMAXSPEED(40);
//        game1.getMAXSPEED();
        int[] speeds = {56, 0, 5};
        GameManager gameManager = new GameManager(game);
        gameManager.countRounds(speeds);

    }
}
