package observer;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        OpenWeatherPublisher weatherPublisher = new OpenWeatherPublisher();
        Channel1 channel1 = new Channel1(weatherPublisher);
        Channel9 channel9 = new Channel9(weatherPublisher);

        weatherPublisher.setData(28,0);
        Thread.sleep(2000);
        weatherPublisher.setData(26,11);
    }
}
