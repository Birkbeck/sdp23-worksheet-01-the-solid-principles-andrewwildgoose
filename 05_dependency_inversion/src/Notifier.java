public class Notifier {

    Phone phone;
    Emailer emailer;

    public void notify(String weatherDescription){
        if (weatherDescription == "rainy") {
            phone = new Phone();
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            emailer = new Emailer();
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
