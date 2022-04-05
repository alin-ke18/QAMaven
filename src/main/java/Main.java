import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] speed = {3, 5, 0};
        Max.setIsGreenLight(false);
        Max.getIsGreenLight();
        Max.numberOfGetOut(speed);
        Arrays.toString(Max.toKnowSpeedOut(speed));
        Max.toKnowStayIn(speed);
    }
}
