package taxes;

public class USNDebits extends TaxSystem {
@Override
    public int calcTaxFor(int debit,int credit) {

        int tax = (debit / 100) * 6; ;
        return Math.max(tax, 0);


    }
}
