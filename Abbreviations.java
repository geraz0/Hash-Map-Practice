import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    private Map<String, String> abbreviationMap;

    public Abbreviations() {
        abbreviationMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        // Normalize the abbreviation to ensure consistency
        abbreviation = abbreviation.toLowerCase();
        abbreviationMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = abbreviation.toLowerCase();
        return abbreviationMap.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        abbreviation = abbreviation.toLowerCase();
        return abbreviationMap.getOrDefault(abbreviation, null);
    }

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println(); // Ensure a new line at the end of the output
    }
}
