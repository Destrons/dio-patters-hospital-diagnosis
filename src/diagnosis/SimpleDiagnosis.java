package diagnosis;

import diseases.Disease;

public class SimpleDiagnosis implements DiagnosisStrategy {
    public String diagnose(Disease disease) {
        return "Diagnóstico: " + disease.getName() +
               ". Sintomas: " + String.join(", ", disease.getSymptoms());
    }
}
