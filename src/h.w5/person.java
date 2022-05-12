package h.w5;

public class person {

    private static final int CURRENT_YEAR=2021;

    private String surname;
    private String secondName;
    private String name;
    private String position;
    private String phone;
    private int salary;
    private int birthYear;




    public person(
            String surname,
            String secondName,
            String name,
            String position,
            String phone,
            int salary,
            int birthYear){

        this.birthYear=birthYear;
        this.name=name;
        this.surname=surname;
        this.phone=phone;
        this.secondName=secondName;
        this.position=position;
        this.salary=salary;
    }

    int getAge(){
        return CURRENT_YEAR - birthYear;
    }

    int getSalary(){
        return salary;
    }

    String getFullInfo(){
        return this.name +" "+
                this.secondName + " "+
                this.surname + "," +
                this.getSalary() + "Ru "+
                this.getAge() + "years old," +
                this.phone + "Salary is" +
                this.position + "Phone number: " ;

    }

}
