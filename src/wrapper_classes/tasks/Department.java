package wrapper_classes.tasks;

public class Department {

	public static void main(String[] args) {

		SectionA a = new SectionA();
		SectionB b = new SectionB();
		Students s = new Students();
		Teachers t = new Teachers();

		Integer sCount = 20;
		Integer tCount = 5;

		a.studentAdd(sCount, s);
		a.teacherAdd(tCount, t);
		b.studentAdd(30, s);
		b.teacherAdd(15, t);

		System.out.println("Students's added in A Section :" + a.getStudentCountinA());

		System.out.println("Teacher's added in A Section :" + a.getTeacherCountinA());

		System.out.println("Students's added in B Section :" + b.getStudentCountinB());

		System.out.println("Teacher's added in B Section :" + b.getTeacherCountinB());

		System.out.println("Total Students :" + s.getStudents());

		System.out.println("Total Teachers :" + t.getteachers());
		
		System.out.println(sCount);
	}

}
