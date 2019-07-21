import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Adding {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Zad1 obj = (Zad1) context.getBean("zad1");
        obj.setValue1(10);
        obj.setValue2(20);
        System.out.println(obj.getValue1());
        System.out.println(obj.getValue2());
        System.out.println(obj.addValue());

        Zad1 obj1a = (Zad1) context.getBean("zad1");
        System.out.println(obj1a.addValue());


        Zad2 obj2 = (Zad2) context.getBean("zad2");
        System.out.println(obj2.getValue1());
        System.out.println(obj2.getValue2());
        System.out.println(obj2.add());
        obj2.setValue1(20);
        obj2.setValue2(30);

        Zad2 obj3 = (Zad2) context.getBean("zad2");
        System.out.println(obj2.getValue1());
        System.out.println(obj2.getValue2());
        System.out.println(obj2.add());
    }
}

