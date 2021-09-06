package TempConverterModule;

/**
 *Обьект (наследник интерфейса Converter) переводящий температуру из Цельсий в Фарингейты
 */

public class FahrenheiConverter implements Converter{
    private final double additionalValue = 32;
    private final double factor = 1.8;
    @Override
    public double convert(double celsius) {
        return (celsius*factor)+additionalValue;
    }
}
