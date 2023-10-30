package Personal;
import General.Staff1;
import info.*;
//Администратор
public class Administrator extends Staff1 implements Staff,Clin,Cash,Check,Help {
    private final int admin_id;
    private static int counter;

    static {
        counter = 1;
    }
    public Administrator(int age, String name, String surname, String patronymic, int working_hours) {
        super(age, name, surname, patronymic, working_hours);
        admin_id=counter++;
    }
    public int getAdmin_id(){
        return admin_id;
    }
    @Override
    public void work() {
        System.out.println("Администрация Кинотеатра");
    }
    @Override
    public void clin(){
        System.out.println("Может прибраться если нет уборщицы");
    }
    @Override
    public void count() {
        System.out.println("Может посчитать");
    }
    @Override
    public void Return() {
        System.out.println("Может сделать возврат");
    }
    @Override
    public void check() {
        System.out.println("Может проверить билет вместо контролера");
    }
    @Override
    public void help() {
        System.out.println("Должен всем помогать");

    }
}
