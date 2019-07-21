import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComputerLouncher {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer obj = (Computer) context.getBean("computer");
        obj.getRam().setValue(256);;
        obj.getRamValue();

        }
}
