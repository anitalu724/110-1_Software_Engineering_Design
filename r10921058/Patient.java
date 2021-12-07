import java.util.*;
public class Patient {
    private String name;
    private int period;
    private List<Device> devices;
    public Patient(String name, int period){
        this.name = name;
        this.period = period;
        this.devices = new ArrayList<Device>();
    }

    public String getName() { return this.name; }
    public int getPeriod() { return this.period; }
    public List<Device> getDevices() { return this.devices; }
    public void addDevice(Device d) { this.getDevices().add(d); }
}