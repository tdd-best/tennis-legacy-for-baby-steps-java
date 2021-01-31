import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTest {

    private Tennis tennis = new Tennis("Joey", "Tom");

    @Test
    public void love_all() {
        scoreShouldBe("love all");
    }

    @Test
    public void fifteen_love() {
        givenFirstPlayerScore(1);
        scoreShouldBe("fifteen love");
    }

    @Test
    public void thirty_love() {
        givenFirstPlayerScore(2);
        scoreShouldBe("thirty love");
    }

    @Test
    public void forty_love() {
        givenFirstPlayerScore(3);
        scoreShouldBe("forty love");
    }

    @Test
    public void love_fifteen() {
        givenSecondPlayerScore(1);
        scoreShouldBe("love fifteen");
    }

    @Test
    public void love_thirty() {
        givenSecondPlayerScore(2);
        scoreShouldBe("love thirty");
    }

    @Test
    public void love_forty() {
        givenSecondPlayerScore(3);
        scoreShouldBe("love forty");
    }

    @Test
    public void fifteen_all() {
        givenFirstPlayerScore(1);
        givenSecondPlayerScore(1);
        scoreShouldBe("fifteen all");
    }

    @Test
    public void thirty_all() {
        givenFirstPlayerScore(2);
        givenSecondPlayerScore(2);
        scoreShouldBe("thirty all");
    }

    @Test
    public void deuce() {
        givenDeuce();
        scoreShouldBe("deuce");
    }

    @Test
    public void first_player_adv() {
        givenDeuce();
        givenFirstPlayerScore(1);
        scoreShouldBe("Joey adv");
    }

    @Test
    public void second_player_adv() {
        givenDeuce();
        givenSecondPlayerScore(1);
        scoreShouldBe("Tom adv");
    }

    @Test
    public void second_player_win() {
        givenDeuce();
        givenSecondPlayerScore(2);
        scoreShouldBe("Tom win");
    }

    @Test
    public void first_player_win() {
        givenDeuce();
        givenFirstPlayerScore(2);
        scoreShouldBe("Joey win");
    }

    private void givenDeuce() {
        givenFirstPlayerScore(3);
        givenSecondPlayerScore(3);
    }

    private void givenSecondPlayerScore(int times) {
        for (int i = 0; i < times; i++) {
            tennis.secondPlayerScore();
        }
    }

    private void givenFirstPlayerScore(int times) {
        for (int i = 0; i < times; i++) {
            tennis.firstPlayerScore();
        }
    }

    private void scoreShouldBe(String expected) {
        assertEquals(expected, tennis.score());
    }
}
