package RSIGenerators;

import Elements.RSI;
import Readers.DatabaseReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RSICalculator {
    File csvFile = new File("D:\\projects\\tradingbot\\src\\main\\resources\\SBIN.csv");
    private DatabaseReader PriceAverageFile = new DatabaseReader(csvFile.getAbsolutePath());

    public List<Float> getRSIList() {
        ArrayList<Float> RSList =  getRSList();
        ArrayList<Float> RSIList = new ArrayList<>();

        for (int i = 1; i < RSList.size(); i++) {
            Float RSvalue = RSList.get(i);
            Float RSI = 100 - 100 / (1 + RSvalue);
            RSIList.add(RSI);
        }

        return RSIList;
    }

    private ArrayList<Float> getRSList() {
        ArrayList<RSI> PriceAverage =  PriceAverageFile.getRSIModel();
        ArrayList<Float> RSList = new ArrayList<>();

        for (int i = 1; i < PriceAverage.size(); i++) {
            RSI rsi = PriceAverage.get(i);
            Float tempRSValue = Float.parseFloat(rsi.getMoveingAverageDown()) / Float.parseFloat(rsi.getMoveingAvrageUp());
            RSList.add(tempRSValue);
        }
        return RSList;
    }
}
