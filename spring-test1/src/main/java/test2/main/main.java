package test2.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test2.config.TestConfig;
import test2.service.TestService;

public class main {
	public static void main(String[] args){
		// 创建 context ，并向其注册一个 User bean。
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
		// 将 User bean 拿出来。
		TestService bean =  context.getBean(TestService.class);
		bean.testMethod();

		//配置文件方式
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
		TestService bean1 = classPathXmlApplicationContext.getBean(TestService.class);
		bean1.testMethod();

	}
}
