package TempConverterModule;

public class Locale {
    private final String m_local;
    Locale(){
        m_local = java.util.Locale.getDefault().getCountry();
        //System.out.println(m_local);
    }

    String getLocal(){
        return m_local;
    }
}
