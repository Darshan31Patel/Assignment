package observer;

public class WebsiteDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Website Display: Temperature = " + temperature + 
                           ", Humidity = " + humidity + 
                           ", Pressure = " + pressure);
    }
}