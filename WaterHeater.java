import java.util.Date;

public class WaterHeater extends ServiceCall{

    private int age;  // of heater in years

    public WaterHeater(String serviceAddress, Date date, String problemDescription, int age) {
        super(serviceAddress, problemDescription, date);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static int extraFee = 20;

    public String toString() {
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);

        return "Water heater Service Call " + "\n" +
                "Service Address = " + serviceAddress + "\n" +
                "Heater age = " + getAge() + " years\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Service charge = " + feeString + "\n" +
                "Mandatory city fee = $" + extraFee + "\n" +
                "Total cost = $" + (fee + extraFee);
    }
}