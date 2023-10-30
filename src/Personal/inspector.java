package Personal;
import General.Staff1;
import info.Clin;
import info.Help;
import info.Staff;
import info.Check;
//Проверяющий билеты
public class inspector extends Staff1 implements Staff,Clin,Check,Help {
    private final int inspector_id;
    private static int counter;

    static {
        counter = 3;
    }
    public inspector(int age, String name, String surname, String patronymic, int working_hours) {
        super(age, name, surname, patronymic, working_hours);
        inspector_id=counter++;
    }
    public int getInspector_id(){
        return inspector_id;
    }
    @Override
    public void work(){
        System.out.println("Проверяет билеты");
    }
    @Override
    public void clin(){
        System.out.println("Может убрать своё рабочее место");
    }
    @Override
    public void check() {
        System.out.println("Проверяет билеты");
    }
    @Override
    public void help() {
        System.out.println("Может помочь человеку");
    }
}
