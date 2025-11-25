import taxes.TaxSystem;
import taxes.USNDebits;
import taxes.USNDebitsMinusCredits;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Company company = new Company("Сбер", new USNDebitsMinusCredits());
        company.shiftMoney(10000);
        company.shiftMoney(-100);


        Deal[] deals = {
                new Sale("яболоко", 150),
                new Sale("Монитор", 15000),
                new Expenditure("Шкаф", 5000)
        };



        company.applyDeals(deals);
    }
}