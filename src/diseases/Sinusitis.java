package diseases;

public class Sinusitis implements Disease {
    public String getName() { return "Sinusite"; }
    public String[] getSymptoms() {
        return new String[] { "Dor de cabeça", "Congestão nasal", "Pressão facial" };
    }
}
