import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Anime a = new Anime("Bleach", LocalDateTime.now(),Status.Watching,360,304,12);
        a.displayInfo();
    }
}
