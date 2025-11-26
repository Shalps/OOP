
import taxes.USNDebits;
import taxes.USNDebitsMinusCredits;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Company company = new Company("Сбер", new USNDebits());
        company.shiftMoney(10000);
        company.shiftMoney(-1000);
        company.payTaxes();

        company.setTaxSystem(new USNDebitsMinusCredits());

        Deal[] deals = {
                new Sale("яболоко", 10000),
                new Sale("Монитор", 1000),
                new Expenditure("Шкаф", 10000)
        };

        System.out.println( company.applyDeals(deals));
        System.out.println("Разница доходов и расходов, которая была на момент старта уплаты налогов: " +company.applyDeals(deals)+" руб." );

    }
}