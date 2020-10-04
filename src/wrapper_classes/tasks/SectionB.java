package wrapper_classes.tasks;

public class SectionB {

	private Integer classStudentStrength = 0;
	private Integer classTeachersStrength = 0;

	public void studentAdd(Integer a, Students s) {

		classStudentStrength += a;
		s.setStudents(a);

	}

	public void teacherAdd(Integer b, Teachers t) {
		classTeachersStrength += b;
		t.setteachers(b);

	}

	public int getStudentCountinB() {
		return classStudentStrength;
	}

	public int getTeacherCountinB() {
		return classTeachersStrength;
	}

}
