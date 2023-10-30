package Personal;

import General.Staff1;
import info.Help;
import info.Staff;
//Уборщик или уборщица
public class Cleaning extends Staff1 implements Staff,Help {
    private final int cleaning_id;
    private static int counter;

    static {
        counter = 4;
    }
    public Cleaning(int age, String name, String surname, String patronymic, int working_hours) {
        super(age, name, surname, patronymic, working_hours);
        cleaning_id = counter++;
    }
    public int getCleaning_id(){
        return cleaning_id;
    }
    @Override
    public void work() {
        System.out.println("Убирает кинотеатр");
    }
    @Override
    public void help() {
        System.out.println("Может помочь человеку");
    }
}
