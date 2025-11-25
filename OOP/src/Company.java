import taxes.TaxSystem;
import taxes.USNDebits;

public class Company {

    public String title;
    public int debit = 0;
    public int credit = 0;
    private TaxSystem taxSystem;


    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }



    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        }
        if (amount < 0) {
            credit += Math.abs(amount);
        }

    }
    public  void payTaxes() {
       System.out.println("Компания "+ title +" уплатила налог в размере:" + taxSystem.calcTaxFor(debit,credit)+" руб.");
       debit=0;
       credit=0;

    }


    public int applyDeals (Deal[] deals){
       for (Deal deal:deals){
          this.debit+=deal.getDebitChange();
           this.credit+= deal.getCreditChange();
       }
        payTaxes();

        return this.debit- this.credit;
    }
}
