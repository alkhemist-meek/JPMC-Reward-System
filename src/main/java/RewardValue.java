public class RewardValue {
    private double cashValue;
    private double milesValue;
    private final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;


    public RewardValue(double value) {
        if (valueShouldBeTreatedAsMiles(value)) {
            this.milesValue = value;
            this.cashValue = convertMilesToCash(value);
        } else {
            this.cashValue = value;
            this.milesValue = convertCashToMiles(value);
        }
    }

    private boolean valueShouldBeTreatedAsMiles(double value) {
        return value > 1000; // Example threshold
    }

    // Method to get cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return this.milesValue;
    }

    // Method to convert cash to miles
    public static double convertCashToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    // Method to convert miles to cash
    public static double convertMilesToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}
