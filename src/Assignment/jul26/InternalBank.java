package Assignment.jul26;

public class InternalBank extends BankOfCanada {

    @Override
    public double RateOfInterest() {
        super.RateOfInterest();
        return (rateOfInterest+internalRate);

    }


}
