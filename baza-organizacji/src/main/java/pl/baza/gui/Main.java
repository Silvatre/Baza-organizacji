package pl.baza.gui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		System.out.print(context.containsBean("myDataSource"));
	}

}
