package hellobean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringDemo_BeanFactory {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("beans-config.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        hellobean.HelloBean helloBean =
                (hellobean.HelloBean) factory.getBean("helloBean");
        // 呼叫 getBean() 時同時指定型態即不需要轉型
//        hellobean.HelloBean helloBean =
//                factory.getBean("helloBean", hellobean.HelloBean.class);

        System.out.println("Hello " + helloBean.getName());
    }
}
