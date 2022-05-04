import java.security.SecureRandom;
import java.util.Arrays;

public class Max {

    private boolean isGreenLight;
    private static final int maxSpeed = 60;
//
//    public void setIsGreenLight(boolean isGreenLight) {
//        Max.isGreenLight = isGreenLight;
//    }

    public Max(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

//    public static void getIsGreenLight() {
////        if (isGreenLight) {
////            System.out.println("Светофор зеленый!");
////        } else
////            System.out.println("Светофор красный!");
//    }

    public int numberOfGetOut(int[] speed) {
        if (isGreenLight) {
//            System.out.println("Количество выбывших игроков: 0");
            return 0;
        } else {
            int cnt = 0;

            for (int i : speed) {
                if (i > maxSpeed) {
                    cnt++;
                }
            }
//            System.out.println("Количество выбывших игроков: " + cnt);
            return cnt;
        }
    }

    public int[] toKnowSpeedOut(int[] speeds) {
        if (isGreenLight) {
//            System.out.println("Нет выбывших игроков.");
            return new int[0];
        } else {
            int cnt = 0;
            for (int speed : speeds) {
                if (speed > maxSpeed) {
                    cnt++;
                }
            }
            int[] rest = new int[cnt];
            int i = 0;
            for (int speed : speeds) {
                if (speed > maxSpeed) {
                    rest[i] = speed;
                    i++;
                }
            }
//            System.out.println("Игроки выбыли со скоростью: " + Arrays.toString(rest));
            return rest;
        }
    }

    public int[] toKnowStayIn(int[] speeds) {
        if (isGreenLight) {
//            System.out.println("Скорости игроков: " + Arrays.toString(speeds));
            return speeds;
        } else {
            int cnt = 0;
            for (int speed : speeds) {
                if (speed <= maxSpeed) {
                    cnt++;
                }
            }
            int[] rest = new int[cnt];
            int i = 0;
            for (int speed : speeds) {
                if (speed <= maxSpeed) {
                    rest[i] = speed;
                    i++;
                }
            }
//            System.out.println("Скорости невыбывающих: " + Arrays.toString(rest));
            return rest;
        }

    }

    public  String[] PlayersNameStayedInGame(String[] nameLines) {

        String[] parts1 = new String[nameLines.length];
        String[] parts2 = new String[nameLines.length];
        int i = 0;
        int j = 0;

        for (String line : nameLines) {
            String[] parts = line.split(" ");
            parts1[i] = parts[0];
            i++;

            parts2[j] = parts[1];
            j++;
        }
        if (isGreenLight) {
//            System.out.println(Arrays.toString(parts1));
            return parts1;
        } else {
            int[] elements = new int[parts2.length];
            for (int ii = 0; ii < parts2.length; ii++) {
                elements[ii] = Integer.parseInt(parts2[ii]);
            }
            int cnt = 0;
            for (int element : elements) {
                if (element <= maxSpeed) {
                    cnt++;
                }
            }
            int[] numberIn = new int[cnt];
            String[] inGame = new String[cnt];
            int ii = 0;
            for (int el : elements) {
                if (el <= maxSpeed) {
                    numberIn[ii] = el;
                    ii++;
                }
            }
            int a = 0;
//            for (int number : numberOut) {
                for (int b = 0; b < elements.length; b++) {
                    for (int number : numberIn) {
                    if (number == elements[b]) {
                        inGame[a] = parts1[b];
                        a++;
                        break;
                    }
                }
            }
//            System.out.println(Arrays.toString(inGame));
            return inGame;
        }
    }
}
