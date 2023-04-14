public class CasualGreeting implements Greeting{

    public String formality = "casual";

    @Override
    public String greeting() {
        return "Goodday?";
    }
}
