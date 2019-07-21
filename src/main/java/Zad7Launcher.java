import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad7Launcher {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Bus bus = context.getBean(Bus.class);
        bus.getDriver().setName("marek");
        System.out.println(bus.getDriver().getName());
    }
}
