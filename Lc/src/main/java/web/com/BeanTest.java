package web.com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author:lc
 * @date:2020/3/24
 * @description:spring
 */
public class BeanTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConifg.class);
		System.out.println(context.getBean(User.class));
	}
}
