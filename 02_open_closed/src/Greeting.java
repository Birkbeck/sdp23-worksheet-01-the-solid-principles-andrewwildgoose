import java.util.*;

public class Greeting {
    Map<String, String> greetingStore = new HashMap<>(){{
        put(null, "Hello.");
        put("formal", "Good evening");
        put("casual", "Goodday?");
        put("intimate", "Hello darling!");
    }};

    public void addGreeting(String formality, String greeting){
        greetingStore.put(formality, greeting);
    }

    public String getGreeting(String formality) {
        return greetingStore.get(formality);

    }
}
