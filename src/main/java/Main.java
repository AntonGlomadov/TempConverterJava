import TempConverterModule.ConverterBuilder;
import TempConverterModule.LocalConverterBuilder;
import TempConverterModule.Converter;

public class Main {
    public static void main(String[] args) throws Exception {
        ConverterBuilder builder = new LocalConverterBuilder();
        try {
            Converter converter = builder.create();
            System.out.println(converter.convert(100));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}