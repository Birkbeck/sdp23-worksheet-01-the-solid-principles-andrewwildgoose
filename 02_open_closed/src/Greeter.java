public class Greeter {
    String formality;

    public String greet() {
        Greeting greeting = new Greeting();
        return greeting.getGreeting(this.formality);
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
