package diagnosis;

import diseases.Disease;

public interface DiagnosisStrategy {
    String diagnose(Disease disease);
}
