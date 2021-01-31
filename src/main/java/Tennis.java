public class Tennis {
    private final String all = "all";
    private final String deuce = "deuce";
    private final String firstPlayerName;
    private final String secondPlayerName;
    private int secondPlayerScoreTimes;
    private int firstPlayerScoreTimes;
    private String love;
    private String fifteen;
    private String thirty;
    private String forty;

    public Tennis() {
        firstPlayerName = "Joey";
        secondPlayerName = "Tom";
    }

    public String score() {
        love = "love";
        fifteen = "fifteen";
        thirty = "thirty";
        forty = "forty";
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 0) {
            return love + " " + all;
        }
        if (firstPlayerScoreTimes == 1 && secondPlayerScoreTimes == 0) {
            return fifteen + " " + love;
        }
        if (firstPlayerScoreTimes == 2 && secondPlayerScoreTimes == 0) {
            return thirty + " " + love;
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 0) {
            return forty + " " + love;
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 1) {
            return love + " " + fifteen;
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 2) {
            return love + " " + thirty;
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 3) {
            return love + " " + forty;
        }
        if (firstPlayerScoreTimes == 1 && secondPlayerScoreTimes == 1) {
            return fifteen + " " + all;
        }
        if (firstPlayerScoreTimes == 2 && secondPlayerScoreTimes == 2) {
            return thirty + " " + all;
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 3) {
            return deuce;
        }
        if (firstPlayerScoreTimes == 4 && secondPlayerScoreTimes == 4) {
            return deuce;
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
