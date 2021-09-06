package TempConverterModule;

/**
 *Создатель конвертора из Цельсий в Кельвины
 */

public class KelvinConverterBuilder extends ConverterBuilder{
    @Override
    public Converter create() {
        return new KelvinKonverter();
    }
}
