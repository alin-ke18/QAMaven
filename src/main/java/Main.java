import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] speed = {3, 65, 60};
//        Max.setIsGreenLight(false);
//        Max.getIsGreenLight();
//        Max.numberOfGetOut(speed);
//        Arrays.toString(Max.toKnowSpeedOut(speed));
//        Max.toKnowStayIn(speed);
        Max max = new Max(false);
        String[] players = {"Katya 60", "Sveta 60", "Igor 75", "Olya 15"};
        max.PlayersNameStayedInGame(players);
//        Max max = new Max(true);
//        max.PlayersNameStayedInGame(players);
//        Game game = new Game(true);

        SpeedyGame spGame = new SpeedyGame(false, 60);

//        game.isFailed(8);
//        SpeedyGame game1 = new SpeedyGame(false, 60);
//        game1.getMAXSPEED();
//        game1.setMAXSPEED(40);
//        game1.getMAXSPEED();
        int[] speeds = {70, 0, 5};
//        GameManager gameManager = new GameManager(game);
//        gameManager.countRounds(speeds);
        GameManager gameManager1 = new GameManager(spGame);
        gameManager1.countRounds(speeds);
    }
}
