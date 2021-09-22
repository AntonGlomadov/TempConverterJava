package TempConverterModule;

public class ConvertorFactory {

    public Converter create(Locale loc){
        switch (loc.getLocal()){
            case "US":
                return new FahrenheiConverter();
            case "RU":
                return new CelsiumConverter();
            default:
                return new KelvinKonverter();
        }
    }
}
