package Trading;

import RSIGenerators.RSICalculator;

public class TradeActions {
    private static RSICalculator rsiCalculator = new RSICalculator();

    public static void Start() {
        for (int count = 0; count < rsiCalculator.getRSIList().size(); count++) {
            Float rsiValue = rsiCalculator.getRSIList().get(count);
            if(rsiValue < 45) {
                sellStocks(rsiValue);
            }
            else if( rsiValue > 55) {
                buyStocks(rsiValue);
            }
        }
    }

    private static void sellStocks(Float rsiValue) {
        System.out.println(rsiValue + " sold");
    }

    private static void buyStocks(Float rsiValue) {
        System.out.println(rsiValue + " bought");
    }
}
