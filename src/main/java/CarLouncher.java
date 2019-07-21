import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarLouncher {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car1 = (Car) context.getBean("car");
        car1.getEngine().setPower(105);
        car1.getEnginePower();

    }
}
