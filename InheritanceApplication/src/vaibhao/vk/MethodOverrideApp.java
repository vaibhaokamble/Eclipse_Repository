package vaibhao.vk;

class GraceMarks {
	int graceMaxMarks;

	void setGraceMarks() {
		graceMaxMarks = 40;
	}
}

class BoardExam extends GraceMarks {
	void setGraceMarks() {
		graceMaxMarks = 30;
	}

	void showBoardGrace() {
		System.out.println("Grace Marks is " + graceMaxMarks);
	}
}

class UniversityExam extends GraceMarks {
	void setGraceMarks() {
		graceMaxMarks = 10;
	}

	void showUniversityGrace() {
		System.out.println("Grace Marks is " + graceMaxMarks);
	}
}

public class MethodOverrideApp {

	public static void main(String[] args) {
		BoardExam b = new BoardExam();
		b.setGraceMarks();
		b.showBoardGrace();
		UniversityExam ue = new UniversityExam();
		ue.setGraceMarks();
		ue.showUniversityGrace();
	}
}
