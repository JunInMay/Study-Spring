package springDependencyInjection.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springDependencyInjection.di.entity.Exam;
import springDependencyInjection.di.entity.NewlecExam;
import springDependencyInjection.di.ui.ExamConsole;
import springDependencyInjection.di.ui.GridExamConsole;

public class Program {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springDependencyInjection/di/setting.xml");

		//ExamConsole console = (GridExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		
		Exam exam = context.getBean(Exam.class);
		
		List<Exam> exams = (List<Exam>)context.getBean("exams"); // new ArrayList<>();
		
		console.print();
		
		Exam exam2 = (NewlecExam)context.getBean("exam");
		
		for (Exam e : exams) {
			System.out.println(e);
		}
	}
}
