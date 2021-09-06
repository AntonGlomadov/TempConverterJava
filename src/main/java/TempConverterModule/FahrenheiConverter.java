package TempConverterModule;

public class FahrenheiConverter implements Converter{
    private final double additionalValue = 32;
    private final double factor = 1.8;
    @Override
    public double convert(double celsius) {
        return (celsius*factor)+additionalValue;
    }
}
