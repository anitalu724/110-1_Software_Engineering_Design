public class PulseSensor extends Device{
    public PulseSensor(String name, int safeRangeLowerBound, int safeRangeUpperBound, Patient patient){
        super("PulseSensor", name, safeRangeLowerBound, safeRangeUpperBound, patient);
    }
}