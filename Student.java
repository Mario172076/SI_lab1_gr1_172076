import java.util.List;

class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints;

	//TODO constructor

	public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}


	//TODO seters & getters

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	int sum = 0;
	float average = 0;
	public double getAverage() {
		//TODO
		for (int i=0; i<labPoints.length; i++){
			sum+=labPoints[i];
		}

		average = sum / labPoints.length;
		return average;
	}

	boolean imaPotpis = false;
	public boolean hasSignature() {
		//TODO
		if(labPoints.length >8)
			imaPotpis = true;
		else
			imaPotpis = false;

		return imaPotpis;
	}
}


class Course {
	List<Student>student;

	public Course(List<Student> student) {
		this.student = student;
	}

	void add(Student newStudent){
		student.add(newStudent);
	}
	void remove(int index){
		student.remove(index);
	}
}
