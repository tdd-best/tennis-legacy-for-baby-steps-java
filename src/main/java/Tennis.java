public class Tennis {
    private int secondPlayerScoreTimes;
    private int firstPlayerScoreTimes;

    public String score() {
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 0) {
            return "love all";
        }
        if (firstPlayerScoreTimes == 1 && secondPlayerScoreTimes == 0) {
            return "fifteen love";
        }
        if (firstPlayerScoreTimes == 2 && secondPlayerScoreTimes == 0) {
            return "thirty love";
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 0) {
            return "forty love";
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 1) {
            return "love fifteen";
        }
        if (firstPlayerScoreTimes == 0 && secondPlayerScoreTimes == 2) {
            return "love thirty";
        }
        if (firstPlayerScoreTimes == 1 && secondPlayerScoreTimes == 1) {
            return "fifteen all";
        }
        if (firstPlayerScoreTimes == 2 && secondPlayerScoreTimes == 2) {
            return "thirty all";
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 3) {
            return "deuce";
        }
        if (firstPlayerScoreTimes == 4 && secondPlayerScoreTimes == 4) {
            return "deuce";
        }
        if (firstPlayerScoreTimes == 4 && secondPlayerScoreTimes == 3) {
            return "Joey adv";
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 4) {
            return "Tom adv";
        }
        if (firstPlayerScoreTimes == 5 && secondPlayerScoreTimes == 3) {
            return "Joey win";
        }
        if (firstPlayerScoreTimes == 3 && secondPlayerScoreTimes == 5) {
            return "Tom win";
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
