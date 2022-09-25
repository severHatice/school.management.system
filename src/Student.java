public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //fees for every student is $10.000
    //fees paid initially is 0.

    //create a new student obj by initializing.
    public Student(int id,String name,int grade){
        this.feesPaid=0;
        this.feesTotal=10000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    public void setGrade(int grade){
        this.grade=grade;
    }
    //keep adding the fees to feesPaid field
    //add the fees to the fees paid
    //the school is going to receive the funds
    public void updateFeesPaid(int fees){
       feesPaid+=fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
}
