import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Zad8Autokonfiguracja {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        ((AnnotationConfigApplicationContext) context).start();;
        ((AnnotationConfigApplicationContext) context).refresh();;
        ((AnnotationConfigApplicationContext) context).stop();
    }
}
