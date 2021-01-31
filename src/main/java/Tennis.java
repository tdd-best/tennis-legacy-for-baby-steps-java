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
        if (isSameScore()) {
            if (isDeuce()) {
                return deuce;
            }
            return sameScore();
        }
        if (isLookupScore()) {
            return lookupScore();
        }
        if (firstPlayerScoreTimes == 4 && secondPlayerScoreTimes == 3) {
            return advPlayer() + " adv";
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 4) {
            return advPlayer() + " adv";
        }
        if (firstPlayerScoreTimes == 5 && secondPlayerScoreTimes == 3) {
            return advPlayer() + " win";
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 5) {
            return advPlayer() + " win";
        }
        return null;
    }

    public void firstPlayerScore() {
        this.firstPlayerScoreTimes++;
    }

    public void secondPlayerScore() {
        this.secondPlayerScoreTimes++;
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
