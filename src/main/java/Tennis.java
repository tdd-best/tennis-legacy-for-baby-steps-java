import java.util.HashMap;

public class Tennis {
    private final String all = "all";
    private final String deuce = "deuce";
    private final String firstPlayerName;
    private final String secondPlayerName;
    private final HashMap<Integer, String> scoreLookup = new HashMap<>() {{
        put(0, "love");
        put(1, "fifteen");
        put(2, "thirty");
        put(3, "forty");
    }};
    private int secondPlayerScoreTimes;
    private int firstPlayerScoreTimes;

    public Tennis() {
        firstPlayerName = "Joey";
        secondPlayerName = "Tom";
    }

    public String score() {
        if (firstPlayerScoreTimes == secondPlayerScoreTimes) {
            if (firstPlayerScoreTimes >= 3) {
                return deuce;
            }
            return scoreLookup.get(firstPlayerScoreTimes) + " " + all;
        }
        if (firstPlayerScoreTimes < 4 && secondPlayerScoreTimes == 0) {
            return scoreLookup.get(firstPlayerScoreTimes) + " " + scoreLookup.get(secondPlayerScoreTimes);
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes < 4) {
            return scoreLookup.get(firstPlayerScoreTimes) + " " + scoreLookup.get(secondPlayerScoreTimes);
        }
        if (firstPlayerScoreTimes == 4 && secondPlayerScoreTimes == 3) {
            return firstPlayerName + " adv";
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 4) {
            return secondPlayerName + " adv";
        }
        if (firstPlayerScoreTimes == 5 && secondPlayerScoreTimes == 3) {
            return firstPlayerName + " win";
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 5) {
            return secondPlayerName + " win";
        }
        return null;
    }

    public void firstPlayerScore() {
        this.firstPlayerScoreTimes++;
    }

    public void secondPlayerScore() {
        this.secondPlayerScoreTimes++;
    }
}
