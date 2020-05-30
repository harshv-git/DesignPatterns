package observer;

public class Channel1 implements Observer {

    Channel1(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable) {
        if(observable instanceof OpenWeatherPublisher){
            OpenWeatherPublisher weatherPublisher = (OpenWeatherPublisher) observable;
            printStatus(weatherPublisher.getTemp(),weatherPublisher.getWindSpeed());
        }
    }

    private void printStatus(double temp, double windSpeed){
        System.out.println(String.format("Channel 1 : current temperature is %f, wind speed in %.1f KM/Hr",temp,windSpeed));
    }
}
