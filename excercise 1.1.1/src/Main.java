import observer.SmartphoneApp;
import observer.WebsiteDisplay;
import subject.WeatherStation;

public class Main {
    public static void main(String[] args) {
        // Create the weather station (Subject)
        WeatherStation weatherStation = new WeatherStation();

        // Create observers (Smartphone App and Website Display)
        SmartphoneApp smartphoneApp = new SmartphoneApp();
        WebsiteDisplay websiteDisplay = new WebsiteDisplay();

        // Register the observers to the weather station
        weatherStation.registerObserver(smartphoneApp);
        weatherStation.registerObserver(websiteDisplay);

        // Simulate weather data updates
        weatherStation.setWeatherData(25.0f, 65.0f, 1013.0f);
        System.out.println("---Weather Updated---");
        
        weatherStation.setWeatherData(28.0f, 60.0f, 1012.0f);
        System.out.println("---Weather Updated---");

        // Remove website display and update the weather again
        weatherStation.removeObserver(websiteDisplay);
        weatherStation.setWeatherData(30.0f, 55.0f, 1011.0f);
    }
}
