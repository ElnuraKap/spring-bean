package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());



        Cat one  = (Cat) applicationContext.getBean("cat");
        System.out.println(one.getGetMassag());
        Cat two = (Cat) applicationContext.getBean("cat");
        System.out.println(two.getGetMassag());
        System.out.println("Ссылаются ли на один и тод же bean: " + (one == two));
    }
}
