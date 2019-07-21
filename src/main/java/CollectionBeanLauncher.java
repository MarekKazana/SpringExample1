import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionBeanLauncher {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CollectionBean obj = (CollectionBean) context.getBean("collectionBean");
        System.out.println(obj.getList().toString());
        System.out.println(obj.getMap().toString());
        System.out.println(obj.getSet().toString());
    }
}
