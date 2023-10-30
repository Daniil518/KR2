package General;

public abstract class Staff1 {
    private int age;
    private String name;
    private String surname;
    private String patronymic;
    private int working_hours;

    public Staff1(int age,String name,String surname,String patronymic,int working_hours){
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.working_hours = working_hours;
    }
    public int getWorking_hours(){
        return working_hours;
    }
    public void setWorking_hours(int working_hours){
        this.working_hours=working_hours;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public void setPatronymic(String patronymic){
        this.patronymic=patronymic;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int Age){
        this.age=age;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
}

