public class TemperatureSensor extends Device{
    public TemperatureSensor(String name, int safeRangeLowerBound, int safeRangeUpperBound, Patient patient){
        super("TemperatureSensor", name, safeRangeLowerBound, safeRangeUpperBound, patient);
    }
}