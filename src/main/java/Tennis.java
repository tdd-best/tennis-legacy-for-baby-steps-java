import java.util.HashMap;

import static java.lang.Math.abs;

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
        if (isSameScore()) {
            if (isDeuce()) {
                return deuce;
            }
            return sameScore();
        }
        if (isLookupScore()) {
            return lookupScore();
        }
        return String.format("%s %s", advPlayer(), isAdv() ? "adv" : "win");
    }

    public void firstPlayerScore() {
        this.firstPlayerScoreTimes++;
    }

    public void secondPlayerScore() {
        this.secondPlayerScoreTimes++;
    }

    private boolean isAdv() {
        return abs(firstPlayerScoreTimes - secondPlayerScoreTimes) == 1;
    }

    private String advPlayer() {
        String advPlayer = firstPlayerScoreTimes > secondPlayerScoreTimes ? this.firstPlayerName : this.secondPlayerName;
        return advPlayer;
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
        return scoreLookup.get(firstPlayerScoreTimes) + " " + all;
    }

    private String lookupScore() {
        return scoreLookup.get(firstPlayerScoreTimes) + " " + scoreLookup.get(secondPlayerScoreTimes);
    }
}
