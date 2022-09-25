import java.util.List;

public class School {
    private List<Teacher> teacher;
    private List<Student> student;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }
//add a teacher to the school
    public void addTeacher(Teacher teacher) {
   this.teacher.add(teacher);
    }

    public List<Student> getStudent() {
        return student;
    }

    public void addStudent(Student student) {
        this.student.add(student);
    }
//*********
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int moneyEarned) {
       totalMoneyEarned+= totalMoneyEarned;

    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int MoneySpent) {
       totalMoneySpent = totalMoneySpent-totalMoneySpent;
    }
}
