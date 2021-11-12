package Machine;

public enum Coin {
    OneRupee(1), FiveRupees(5), TenRupees(10), TwentyRupees(20), FiftyRupees(50);
   
    private int denomination;
   
    private Coin(int denomination){
        this.denomination = denomination;
    }
   
    public int getDenomination(){
        return denomination;
    }
}