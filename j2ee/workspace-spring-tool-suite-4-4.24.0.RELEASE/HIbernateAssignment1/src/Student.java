

public class Student {
	int studentId;
	String name;
	String stream;
	int marks;
	
	Student(){}

	public Student(int studentId, String name, String stream, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.stream = stream;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", stream=" + stream + ", marks=" + marks + "]";
	}
	
	
}
