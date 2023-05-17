package solid.dependency;

public class CurrencyAggregator {
    private EUROApi euroApi;
    private USDApi usdApi;

    public int getEuroValue() {
        return (int) ((int) euroApi.getEuro() +
                toZloty(usdApi.getDolar()) / 2);
    }

    private double toZloty(double euro) {
        return (euro * 4.5);
    }
}
