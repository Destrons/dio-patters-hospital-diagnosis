package record;

import java.util.ArrayList;
import java.util.List;

public class ResultRegistry {
    private static ResultRegistry instance;
    private final List<String> results;

    private ResultRegistry() {
        results = new ArrayList<>();
    }

    public static ResultRegistry getInstance() {
        if (instance == null) {
            instance = new ResultRegistry();
        }
        return instance;
    }

    public void addResult(String result) {
        results.add(result);
    }

    public void showAll() {
        System.out.println("\n=== REGISTRO DE RESULTADOS ===");
        for (String r : results) {
            System.out.println(r);
        }
    }
}
