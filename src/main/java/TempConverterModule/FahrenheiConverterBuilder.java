package TempConverterModule;

/**
 *Создатель конвертора из Цельсий в Фарингейты
 */

public class FahrenheiConverterBuilder extends ConverterBuilder {

    @Override
    public Converter create() {
        return new FahrenheiConverter();
    }
}
