package ev01;

public class AcademicAssignment {
	private String nameAssignment;
	private float qualification;
	
	public AcademicAssignment (String name, float qualification) {
		this.nameAssignment = name;
		this.qualification = qualification;
		
	}
	//////////////////////////
	public String getNameAsmt() {
		return nameAssignment;
	}
	
	public float getQualification() {
		return qualification;
		
	}
}
