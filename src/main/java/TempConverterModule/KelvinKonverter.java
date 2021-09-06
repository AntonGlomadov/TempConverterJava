package TempConverterModule;

public class KelvinKonverter implements Converter{

    private final double additionalValue = 273.15;

    @Override
    public double convert(double celsius) {
        return celsius+additionalValue;
    }
}
