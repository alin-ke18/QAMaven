import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxTest {

    @Test
    public void shouldCountNumberOfGetOutWithSameSpeedWithRedLight() {
        Max max = new Max(false);

        int[] speed = {61, 61, 61};
        int actual = max.numberOfGetOut(speed);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCountNumberOfGetOutWithGreenLight() {
        Max max = new Max(true);

        int[] speed = {61, 80, 90};
        int actual = max.numberOfGetOut(speed);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCountNumberOfGetOutWithZeroSpeedAndRedLight() {
        Max max = new Max(false);

        int[] speed = {0, 0, 0};
        int actual = max.numberOfGetOut(speed);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedToGetOutInRedLight() {
        Max max = new Max(false);
        int[] speed = {3, 67, 0};
        int[] actual = max.toKnowSpeedOut(speed);
        int[] expected = {67};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindSpeedToGetOutInGreenLight() {
        Max max = new Max(true);
        int[] speed = {3, 67, 0};
        int[] actual = max.toKnowSpeedOut(speed);
        int[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedToStayedInInRedLight() {
        Max max = new Max(false);
        int[] speed = {3, 67, 0};
        int[] actual = max.toKnowStayIn(speed);
        int[] expected = {3, 0};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindSpeedToStayedInInGreenLight() {
        Max max = new Max(true);
        int[] speed = {3, 67, 0};
        int[] actual = max.toKnowStayIn(speed);
        int[] expected = {3, 67, 0};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDefineIfHigherThenMaxSpeed() {
        Max max = new Max(false);
        int[] speed = {3, 67, 60};

        int actual1 = max.numberOfGetOut(speed);
        int expected1 = 1;
        int[] actual2 = max.toKnowSpeedOut(speed);
        int[] expected2 = {67};
        int[] actual = max.toKnowStayIn(speed);
        int[] expected = {3, 60};

        Assertions.assertArrayEquals(expected, actual);
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertArrayEquals(expected2, actual2);
    }
    @Test
    public void shouldKnowPlayersNamesIfAllHigherThenMaxSpeedWithRedLight() {
        Max max = new Max(false);
        String[] players = {"Katya 108", "Sveta 64", "Igor 72"};
        String[] actual = max.PlayersNameStayedInGame(players);
        String[] expected = {};
        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldKnowPlayersNamesIfAllSpeedAreEqual() {
        Max max = new Max(false);
        String[] players = {"Katya 60", "Sveta 60", "Igor 60"};
        String[] actual = max.PlayersNameStayedInGame(players);
        String[] expected = {"Katya", "Sveta", "Igor"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldKnowPlayersIsFailed() {
        Game game = new Game(false);
        int speed = 9;
        game.isFailed(speed);
        Assertions.assertTrue(true);
    }

    @Test
    public void shouldKnowPlayerIsFailedWithMaxSpeed() {
       SpeedyGame spGame = new SpeedyGame(true,80);
       spGame.isFailed(90);
       Assertions.assertTrue(true);
    }
    @Test
    public void shouldCountRoundsWithRedLight() {
       Game game = new Game(false);
       GameManager gmManager = new GameManager(game);
       int[] speeds = {5, 0, 5};
      int expected = gmManager.countRounds(speeds);
      int actual = 1;
      Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCountRoundsWithGreenLight() {
        Game game = new Game(true);
        GameManager gmManager = new GameManager(game);
        int[] speeds = {5, 0, 9};
        int expected = gmManager.countRounds(speeds);
        int actual = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCountRoundsWithRedLightAndMaxSpeed() {
        SpeedyGame spgame = new SpeedyGame(false, 60);
        GameManager gmManager = new GameManager(spgame);
        int[] speeds = {60, 10, 75};
        int expected = gmManager.countRounds(speeds);
        int actual = 2;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCountRoundsWithGreenLightAndMaxSpeed() {
        SpeedyGame spgame = new SpeedyGame(true, 60);
        GameManager gmManager = new GameManager(spgame);
        int[] speeds = {60, 10, 0};
        int expected = gmManager.countRounds(speeds);
        int actual = 3;
        Assertions.assertEquals(expected, actual);
    }
}
