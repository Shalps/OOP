package taxes;

public class USNDebitsMinusCredits extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return Math.max((debit - credit)/100*15,0);
    }
}
