import java.util.HashMap;

import static java.lang.Math.abs;

public class Tennis {
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

    public Tennis(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public String score() {
        return isSameScore()
                ? isDeuce() ? "deuce" : sameScore()
                : isLookupScore() ? lookupScore() : advState();
    }

    public void firstPlayerScore() {
        this.firstPlayerScoreTimes++;
    }

    public void secondPlayerScore() {
        this.secondPlayerScoreTimes++;
    }

    private String advState() {
        return String.format("%s %s", advPlayer(), isAdv() ? "adv" : "win");
    }

    private boolean isAdv() {
        return abs(firstPlayerScoreTimes - secondPlayerScoreTimes) == 1;
    }

    private String advPlayer() {
        return firstPlayerScoreTimes > secondPlayerScoreTimes ? this.firstPlayerName : this.secondPlayerName;
    }

    private boolean isLookupScore() {
        return firstPlayerScoreTimes < 4 && secondPlayerScoreTimes < 4;
    }

    private boolean isSameScore() {
        return firstPlayerScoreTimes == secondPlayerScoreTimes;
    }

    private boolean isDeuce() {
        return firstPlayerScoreTimes >= 3;
    }

    private String sameScore() {
        String all = "all";
        return scoreLookup.get(firstPlayerScoreTimes) + " " + all;
    }

    private String lookupScore() {
        return scoreLookup.get(firstPlayerScoreTimes) + " " + scoreLookup.get(secondPlayerScoreTimes);
    }
}
