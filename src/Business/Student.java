package Business;

public class Student {
    private int studentId;
    private Object program;
    private int semester;
    private String courses;
    
    public Student(int studentId, Object program, int semester, String courses) {
        this.studentId = studentId;
        this.program = program;
        this.semester = semester;
        this.courses = courses;
    }
    
    public Student() {	} //for use with buttons *Tim

    public int getStudentId() { // changed to string
        return studentId;
    }

    public void setStudentId(int studentId) { //changed to string 
        this.studentId = studentId;
    }

    public Object getProgram() {
        return program;
    }

    public void setProgram(Object program) {
        this.program = program;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
}
