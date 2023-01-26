public class WeatherTracker {
    String currentConditions;
    Notifier notifier;

    public WeatherTracker() {
        notifier = new Notifier();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        notifier.notify(this.currentConditions);
    }
}
