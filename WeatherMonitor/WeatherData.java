public class WeatherData{
    private float temperature;
    private float humidity;
    private float pressure;
    private String areaName;

    private List<DisplayElement> displayElements;

    public void attach(DisplayElement displayElement){
        this.displayElements.add(displayElement);
    }
    public void detach(DisplayElement displayElement){
        this.displayElements.remove(displayElement);
    }
}