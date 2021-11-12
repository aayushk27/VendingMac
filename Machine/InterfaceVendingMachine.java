package Machine;

public interface InterfaceVendingMachine {
    public void SoldOut(Item q) throws SoldOutException;
    public int display();
    public void NotFullPaid(Item q, int sum) throws NotFullPaidException;
    public int ChangeAmount(Item q, int sum);
    public void CoinsGiven(int c);
    public void IllegalArgument(String s) throws IllegalArgumentException;
}
