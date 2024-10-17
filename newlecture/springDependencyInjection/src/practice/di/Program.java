package practice.di;

import practice.di.entity.Exam;
import practice.di.entity.NewlecExam;
import practice.di.ui.ExamConsole;
import practice.di.ui.GridExamConsole;
import practice.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewlecExam();
		
//		ExamConsole console = new InlineExamConsole(exam);
		ExamConsole console = new GridExamConsole(exam);

		console.print();

	}

}
