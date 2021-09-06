import TempConverterModule.*;

import java.util.Locale;

public class Main {
    private static ConverterBuilder builder;
    public static void main(String[] args) throws Exception {
        try {
            configure();
            doConversetion(15);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Создает определенную фабрику в зависимости от локали системы
     * Если локаль не поддерживается выкидывает ошибку
     * @throws Exception
     */
    static void configure() throws Exception {
        String country = Locale.getDefault().getCountry();
        System.out.println(country);
        switch (country){
            case "US":
                builder = new FahrenheiConverterBuilder();
                break;
            case "RU":
                builder = new KelvinConverterBuilder();
                break;
            default: throw new Exception("No supported local");
        }
    }

    /**
     * Функция выводящая итоговую температуру
     * @param celsium
     */
    static void doConversetion(double celsium){
       System.out.println(builder.doConversation(celsium));
    }


}