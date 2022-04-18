import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxTest {

    @Test
    public void shouldCountNumberOfGetOut() {
        Max max = new Max(false);

        int[] speed = {3, 0, 0};
        int actual = max.numberOfGetOut(speed);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindSpeedToGetOut() {
        Max max = new Max(false);
        int[] speed = {3, 67, 0};
        int[] actual = max.toKnowSpeedOut(speed);
        int[] expected = {67};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedToStayedIn() {
        Max max = new Max(false);
        int[] speed = {3, 67, 0};
        int[] actual = max.toKnowStayIn(speed);
        int[] expected = {3, 0};
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
    public void shouldKnowNamesPlayers() {
        Max max = new Max(false);
        String[] players = {"Katya 108", "Sveta 64", "Igor 2"};
        String[] actual = max.PlayersNameStayedInGame(players);
        String[] expected = {"Igor"};
        Assertions.assertArrayEquals(actual, expected);
    }
}
