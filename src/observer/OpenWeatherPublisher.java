package observer;

public class OpenWeatherPublisher extends Observable {
    private double temp;
    private double windSpeed;

    public void setData(double temp, double windSpeed) {
        this.temp = temp;
        this.windSpeed = windSpeed;
        notifyObservers(this);
    }

    public double getTemp() {
        return temp;
    }

    public double getWindSpeed() {
        return windSpeed;
    }
}
