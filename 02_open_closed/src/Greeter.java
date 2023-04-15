public class Greeter {

    private Greeting greeting;

    public Greeter(){
        this(() -> "Hello.");
    }

    public Greeter(Greeting greeting){
        this.greeting = greeting;
    }



    public void setFormality(String formality) {
        greeting = switch (formality){
            case "formal" -> new FormalGreeting();
            case "casual" -> new CasualGreeting();
            case "intimate" -> new IntimateGreeting();
            default -> () -> "Hello.";
        };
    }

    public String greet(){
        return this.greeting.greet();
    }
}
