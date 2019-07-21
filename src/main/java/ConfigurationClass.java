import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationClass {

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public PersonBean personBean() {
        return new PersonBean();
    }

    @Bean @Scope("prototype")
    public Bus bus(){
        return new Bus(new Driver());
    }

    @Bean @Scope("prototype")
    public Driver driver(){
        return new Driver();
    }

    @Bean
    public CRefreshEventHandler refreshEventHandler(){
        return new CRefreshEventHandler();
    }
}
