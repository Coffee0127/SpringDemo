package hellobean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo_ApplicationContext {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");

        hellobean.HelloBean helloBean = (hellobean.HelloBean) context.getBean("helloBean");
        // 呼叫 getBean() 時同時指定型態即不需要轉型
//        hellobean.HelloBean helloBean = context.getBean("helloBean", hellobean.HelloBean.class);

        System.out.println("Hello " + helloBean.getName());
    }
}
