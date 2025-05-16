package process;

import diseases.Disease;
import diagnosis.DiagnosisStrategy;

public class StandardMedicalProcess extends MedicalProcess {

    public StandardMedicalProcess(DiagnosisStrategy diagnosis) {
        super(diagnosis);
    }

    @Override
    protected void triage(Disease disease) {
        System.out.println("Triagem: paciente apresenta sintomas de " + disease.getName());
    }

    @Override
    protected void consult(Disease disease) {
        System.out.println("Consulta realizada. Analisando sintomas...");
    }
}
