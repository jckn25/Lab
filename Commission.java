public class Commission extends Hourly {
    private double total;
    private double comRate;

    public Commission (String eName, String eAddress, String ePhone,
                   String socSecNumber, double rate, double comRate)
    {
        super (eName, eAddress, ePhone, socSecNumber, rate);

        comRate = 0;
    }
}
