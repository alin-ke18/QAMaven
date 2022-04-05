import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxTest {

    @Test
    public void shouldCountNumberOfGetOut() {
        Max.setIsGreenLight(false);
        Max.getIsGreenLight();
        int[] speed = {3, 0, 0};
        int actual = Max.numberOfGetOut(speed);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindSpeedToGetOut() {
        Max.setIsGreenLight(false);
        Max.getIsGreenLight();
        int[] speed = {3, 67, 0};
        int[] actual = Max.toKnowSpeedOut(speed);
        int[] expected = {3, 67};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedToStayedIn() {
        Max.setIsGreenLight(false);
        Max.getIsGreenLight();
        int[] speed = {3, 67, 0};
        int[] actual = Max.toKnowStayIn(speed);
        int[] expected = {0};
        Assertions.assertArrayEquals(expected, actual);
    }
}
