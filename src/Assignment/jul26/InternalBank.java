package Assignment.jul26;

public class InternalBank extends BankOfCanada {
    double internalRate ;

    public InternalBank(double internalRate) {
        this.internalRate = internalRate;
    }
    @Override
    public double RateOfInterest() {
        return (rateOfInterest+internalRate);

    }


}
