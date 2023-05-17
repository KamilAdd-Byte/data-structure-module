package solid.dependency;

import java.util.Arrays;

public class Aggregator {
    private Currency[] currencies;


    public Aggregator(Currency[] currencies) {
        this.currencies = currencies;
    }

    public double getZloty() {
        return Arrays.stream(currencies)
                .mapToDouble(Currency::getZloty)
                .average()
                .getAsDouble();
    }

}
