package Personal;

import General.Staff1;
import info.Cash;
import info.Check;
import info.Help;
//Кассир
public class cashier extends Staff1 implements Cash,Check,Help {
    private final int casher_id;
    private static int counter;

    static {
        counter = 2;
    }
    public cashier(int age, String name, String surname, String patronymic, int working_hours) {
        super(age, name, surname, patronymic, working_hours);
        casher_id=counter++;
    }
    public int getCasher_id(){
        return casher_id;
    }

    @Override
    public void count() {
        System.out.println("Может посчитать деньги");
    }
    @Override
    public void Return() {
        System.out.println("Может сделать возврат");
    }
    @Override
    public void check() {
        System.out.println("Может проверить билеты если нет контролера");
    }
    @Override
    public void help() {
        System.out.println("Может помочь человеку");
    }
}
