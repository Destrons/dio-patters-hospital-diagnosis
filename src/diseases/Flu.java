package diseases;

public class Flu implements Disease {
    public String getName() { return "Gripe"; }
    public String[] getSymptoms() {
        return new String[] { "Febre", "Tosse", "Dor no corpo" };
    }
}
