package springDependencyInjection.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springDependencyInjection.di.ui.ExamConsole;
import springDependencyInjection.di.ui.GridExamConsole;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springDependencyInjection/di/setting.xml");

		//ExamConsole console = (GridExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		
		console.print();
		
	}
}
