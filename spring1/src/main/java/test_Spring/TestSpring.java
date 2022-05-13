package test_Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		TestBean testbean = context.getBean("testBean", 	TestBean.class );
		System.out.println(testbean.getName());
		context.close();
		
	}

}
