import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad3Launcher {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Zad3 obj = (Zad3) context.getBean("zad3");
        System.out.println(obj.getMessage());
        ((ClassPathXmlApplicationContext) context).close();
    }
}
