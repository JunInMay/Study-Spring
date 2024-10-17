package springDependencyInjection.di;

import springDependencyInjection.di.entity.Exam;
import springDependencyInjection.di.entity.NewlecExam;
import springDependencyInjection.di.ui.ExamConsole;
import springDependencyInjection.di.ui.GridExamConsole;
import springDependencyInjection.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		Exam exam = new NewlecExam();
		
		// inline : 한 줄로 출력하는 예제
//		ExamConsole console = new InlineExamConsole(exam);
		// grid : 그리드로 출력하는 예제

		ExamConsole console = new GridExamConsole(exam);
		
		console.print();
		
	}
}
