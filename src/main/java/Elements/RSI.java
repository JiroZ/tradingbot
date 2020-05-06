package Elements;

public class RSI {
    private String movingAverageUp,movingAverageDown;
    public RSI(String movingAverageUp, String movingAverageDown) {
        this.movingAverageDown = movingAverageDown;
        this.movingAverageUp = movingAverageUp;
    }

    public String getMoveingAverageDown() {
        return movingAverageDown;
    }

    public String getMoveingAvrageUp() {
        return movingAverageUp;
    }
}
