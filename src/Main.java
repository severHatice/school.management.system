import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher tec1=new Teacher(1,"Ayse",1000);
        Teacher tec2=new Teacher(2,"Ali",800);
        Teacher tec3=new Teacher(3,"Aysun",1000);

        List<Teacher> teacherList=new ArrayList<Teacher>(Arrays.asList(tec1,tec2,tec3));

        Student stud1=new Student(1,"Selim",3);
        Student stud2=new Student(2,"Salih",4);
        Student stud3=new Student(3,"Yeliz",3);

        List<Student> studentList=new ArrayList<Student>(Arrays.asList(stud1,stud3,stud2));

        School sch=new School(teacherList,studentList);
        stud1.updateFeesPaid(5000);
        stud2.updateFeesPaid(3000);
        stud3.updateFeesPaid(4000);
        System.out.println("The school has earned $"+sch.getTotalMoneyEarned());

        tec1.receivedSalary(200);
        System.out.println(tec1.getName()+" has a salary "+ tec1.getSalary() );
        System.out.println(stud1);

        tec1.receivedSalary(tec1.getSalary());
        System.out.println(tec1);
        System.out.println(teacherList);
    }
}
