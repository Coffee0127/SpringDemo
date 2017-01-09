package carbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo_IoC {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("car-beans-config.xml");
        carbean.TravelBusiness travelBusiness =
                context.getBean("business", carbean.TravelBusiness.class);
        travelBusiness.travel();
    }
}
