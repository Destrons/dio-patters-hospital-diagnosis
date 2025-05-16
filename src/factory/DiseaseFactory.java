package factory;

import diseases.*;

public class DiseaseFactory {
    public static Disease createDisease(String type) {
        return switch (type.toLowerCase()) {
            case "gripe" -> new Flu();
            case "sinusite" -> new Sinusitis();
            case "gastrite" -> new Gastritis();
            default -> throw new IllegalArgumentException("Doença desconhecida: " + type);
        };
    }
}
