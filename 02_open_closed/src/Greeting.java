public class Greeting (String formality){
    public String getGreeting {
        if (formality == "formal") {
            return "Good evening";
        } else if (formality == "casual") {
            return "Goodday?";
        } else if (formality == "intimate") {
            return "Hello darling!";
        } else {
            return "Hello.";
        }

    }
}
