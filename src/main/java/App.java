import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanCopy =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        Cat beanCatCopy = (Cat) applicationContext.getBean("cat");
        boolean beanResult = bean == beanCopy;
        boolean beanCatResult = beanCat == beanCatCopy;
        System.out.println(beanResult);
        System.out.println(beanCatResult);



    }
}