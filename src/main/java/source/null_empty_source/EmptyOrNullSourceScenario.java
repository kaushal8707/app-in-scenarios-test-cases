package source.null_empty_source;

public class EmptyOrNullSourceScenario {

    public static boolean isBlank(String input){
        return input == null || input.trim().isEmpty();
    }
}
