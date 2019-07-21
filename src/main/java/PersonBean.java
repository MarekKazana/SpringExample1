import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonBean {
    private String name;

    public PersonBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("Let's get started");
    }

    public void cleanup(){
        System.out.println("Closing");
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationClass.class);

        PersonBean personBean = ctx.getBean(PersonBean.class);
        personBean.setName("Hubert Sielecki");
        System.out.println(personBean.getName());
    }
}
