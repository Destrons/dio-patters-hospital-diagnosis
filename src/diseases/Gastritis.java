package diseases;

public class Gastritis implements Disease {
    public String getName() { return "Gastrite"; }
    public String[] getSymptoms() {
        return new String[] { "Dor estomacal", "Náusea", "Azia" };
    }
}
