import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Start {
    public static void main(String[] args) throws CloneNotSupportedException {
        Account acc1 = new Account("Irina Ivanova");

        System.out.println("Создали счет для клиента "+acc1.getNameClient());
        System.out.println("Устанавливаем 100р");
        acc1.addCurrencyVal(CurrencyKind.RUB, 100);
        System.out.println("Клиент "+acc1.getNameClient());
        acc1.printCurVal();

        System.out.println("Изменяем наименование клиента");
        acc1.setNameClient("Ирина Иванова");
        System.out.println("Клиент "+acc1.getNameClient());
        acc1.printCurVal();

        System.out.println("Устанавливаем 300р");
        acc1.addCurrencyVal(CurrencyKind.RUB, 300);
        System.out.println("Клиент "+acc1.getNameClient());
        acc1.printCurVal();

        acc1.addSavepointAccount(1, acc1);

        System.out.println("Отменяем 300р");
        acc1.undo();
        System.out.println("Клиент "+acc1.getNameClient());
        acc1.printCurVal();

        System.out.println("Отменяем Наименование");
        acc1.undo();
        System.out.println("Клиент "+acc1.getNameClient());
        acc1.printCurVal();

        acc1.addSavepointAccount(2, acc1);

        System.out.println("Отменяем 100р");
        acc1.undo();
        System.out.println("Клиент "+acc1.getNameClient());
        acc1.printCurVal();

        System.out.println("Сохранения Account: ");
        acc1.printSavepointAccount();
    }
}