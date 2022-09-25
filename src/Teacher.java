public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int earnedSalary;

    public Teacher(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.earnedSalary=salary;

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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receivedSalary(int salary){
        earnedSalary+= salary;
        School.updateTotalMoneySpent(salary);//*******
    }

    @Override
    public String toString() {
        return "Teacher "+name+" get salary $"+ salary;
    }
}
