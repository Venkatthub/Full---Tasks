package wrapper_classes.tasks;

public class SectionA {

	private Integer classStudentStrength = 0;
	private Integer classTeachersStrength = 0;

	public void studentAdd(Integer sCount, Students s) {

		classStudentStrength += sCount;
		s.setStudents(sCount);

	}

	public void teacherAdd(Integer b, Teachers t) {
		classTeachersStrength += b;
		t.setteachers(b);

	}

	public int getStudentCountinA() {
		return classStudentStrength;
	}

	public int getTeacherCountinA() {
		return classTeachersStrength;
	}

}
