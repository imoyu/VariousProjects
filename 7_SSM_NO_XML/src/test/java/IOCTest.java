import com.ssm.config.Cat;
import com.ssm.config.ConfigForTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOCTest {

    @Test
    public void Test1() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigForTest.class);

        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        Cat cat1 = context.getBean(Cat.class);
        System.out.println(cat1.hashCode());
        Object cat2 = context.getBean("cat");
        System.out.println(cat2.hashCode());
        Object cat3 = context.getBean("cat2");
        System.out.println(cat3.hashCode());
    }

    @Test
    public void Test2() throws IOException {
        Path path = Paths.get("D:\\firefoxdownload\\qwe.txt");
        Files.lines(path)
                .filter(StringUtils::isNotBlank)
                .skip(19000 - 10)
                .limit(10000)
                .forEach(System.out::println);
    }
}
