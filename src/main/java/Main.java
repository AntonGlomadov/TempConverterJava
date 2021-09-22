import TempConverterModule.Converter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        Converter icon=context.getBean("creator", Converter.class);
        System.out.println(icon.convert(temp));
        context.close();
    }

}