public class RewardValue {
    private
    double cashValue;
    int milesValue;
    static double milesTocash_ ;


    public RewardValue (double cashValue) {
         this.cashValue= cashValue;
         this.milesValue = (int) (cashValue / milesTocash_);
    };
    public RewardValue(int milesValue_) {
            this.milesValue = milesValue;
            this.cashValue = milesTocash_ + milesValue;

    };

    public double getCashValue() {
        return cashValue;
    };

    public int getMilesValue() {
        return milesValue;
    };



};
