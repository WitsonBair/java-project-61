package hexlet.code;

public class Utilis {
    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
