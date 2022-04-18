import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxTest {

    @Test
    public void shouldCountNumberOfGetOut() {
        Max.setIsGreenLight(false);
        Max.getIsGreenLight();
        int[] speed = {3, 0, 0};
        int actual = Max.numberOfGetOut(speed);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindSpeedToGetOut() {
        Max.setIsGreenLight(false);
        Max.getIsGreenLight();
        int[] speed = {3, 67, 0};
        int[] actual = Max.toKnowSpeedOut(speed);
        int[] expected = {67};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedToStayedIn() {
        Max.setIsGreenLight(false);
        Max.getIsGreenLight();
        int[] speed = {3, 67, 0};
        int[] actual = Max.toKnowStayIn(speed);
        int[] expected = {3, 0};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDefineIfHigherThenMaxSpeed() {
        Max.setIsGreenLight(false);
        Max.getIsGreenLight();
        int[] speed = {3, 67, 60};

        int actual1 = Max.numberOfGetOut(speed);
        int expected1 = 1;
        int[] actual2 = Max.toKnowSpeedOut(speed);
        int[] expected2 = {67};
        int[] actual = Max.toKnowStayIn(speed);
        int[] expected = {3, 60};

        Assertions.assertArrayEquals(expected, actual);
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertArrayEquals(expected2, actual2);
    }
    @Test
    public void shouldKnowNamesPlayers() {
        Max.setIsGreenLight(false);
        Max.getIsGreenLight();
        String[] players = {"Katya 108", "Sveta 64", "Igor 2"};
        String[] actual = Max.PlayersNameStayedInGame(players);
        String[] expected = {"Igor"};
        Assertions.assertArrayEquals(actual, expected);
    }
}
