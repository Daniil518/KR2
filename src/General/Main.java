package General;

import Personal.Administrator;
import Personal.cashier;
import Personal.inspector;
import Personal.Cleaning;

public class Main {
    public static void main(String[] args) {
        Administrator admin1 = new Administrator(18,"Павел","Банэла","Питурианович",12);
        Administrator admin2 = new Administrator(21,"Кристина","Буланчеза","Александровна",11);
        Administrator admin3 = new Administrator(23,"Альберт","Пунтушенко","Герасимов",9);

        cashier cash1 = new cashier(18,"Борис","Малибу","Петрович",6);
        cashier cash2 = new cashier(22,"Александра","Фильнко","Дмитриевна",12);
        cashier cash3 = new cashier(25,"Павел","Хачубаров","Данилович",12);
        cashier cash4 = new cashier(30,"Степан","Алфиньев","Сергеевич",9);

        inspector ins1 = new inspector(19,"Афанасий","Пулиев","Антонов",12);
        inspector ins2 = new inspector(26,"Александра","Успенская","Сергеевна",9);
        inspector ins3 = new inspector(20,"Григорий","Козлов","Максимов",8);
        inspector ins4 = new inspector(29,"Марта","Демьянова","Артуровна",12);

        Cleaning clin1 = new Cleaning(47,"Екатерина","Рейс","Максимова",8);
        Cleaning clin2 = new Cleaning(40,"Богдан","Кугеев","Артемов",8);

        //Вывод
        admin1.conclusion();
        System.out.println(": Администратор");
        cash1.conclusion();
        System.out.println(": Кассир ");
        ins1.conclusion();
        System.out.println(": Проверяющий ");
        clin1.conclusion();
        System.out.println(": Уборщица ");

    }
}
/*
Создайте структуру классов, которые могли бы использоваться в работе кинотеатра.
В кинотеатре должны храниться списки фильмов, сотрудников, информация о залах и билетах и т.д.
 */