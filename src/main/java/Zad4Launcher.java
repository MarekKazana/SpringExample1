import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad4Launcher {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Zad4Bean obj = (Zad4Bean) context.getBean("zad4Bean");
        System.out.println(obj.getOne());
        System.out.println(obj.getThree());
        System.out.println(obj.getTwo());
    }
}
