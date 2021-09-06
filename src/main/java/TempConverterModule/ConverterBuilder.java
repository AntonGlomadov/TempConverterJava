package TempConverterModule;

/**
 * Абстрактный класс создателя преобразователь температур
 */

public abstract class ConverterBuilder {
    public double doConversation(double celsium) {
        Converter convert = create();
        return convert.convert(celsium);
    }

    public abstract Converter create();
}
