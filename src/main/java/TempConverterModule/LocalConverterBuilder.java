package TempConverterModule;

import java.util.Locale;

public class LocalConverterBuilder implements ConverterBuilder{
    @Override
    public Converter create() throws Exception {
        String country = Locale.getDefault().getCountry();
        System.out.println(country);
        switch (country){
            case "US":
                return new FahrenheiConverter();
            case "RU":
                return new KelvinKonverter();
            default: throw new Exception("No supported local");
        }
    }
}
