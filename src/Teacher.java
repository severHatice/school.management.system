public class Teacher {
    private int id;
    private String name;
    private int salary;

    public Teacher(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=100000;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

}
