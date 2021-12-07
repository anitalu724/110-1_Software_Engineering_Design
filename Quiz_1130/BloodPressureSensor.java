public class BloodPressureSensor extends Device{
    public BloodPressureSensor(String name, int safeRangeLowerBound, int safeRangeUpperBound, Patient patient){
        super("BloodPressureSensor", name, safeRangeLowerBound, safeRangeUpperBound, patient);
    }
}