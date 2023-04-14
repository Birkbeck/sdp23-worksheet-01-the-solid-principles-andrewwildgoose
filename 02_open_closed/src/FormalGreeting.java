public class FormalGreeting implements Greeting{

    public String formality = "formal";

    @Override
    public String greeting() {
        return "Good evening";
    }
}
