package process;

import diseases.Disease;
import diagnosis.DiagnosisStrategy;
import record.ResultRegistry;

public abstract class MedicalProcess {
    protected DiagnosisStrategy diagnosis;

    public MedicalProcess(DiagnosisStrategy diagnosis) {
        this.diagnosis = diagnosis;
    }

    public final void process(Disease disease) {
        triage(disease);
        consult(disease);
        String result = diagnosis.diagnose(disease);
        ResultRegistry.getInstance().addResult(result);
        showResult(result);
    }

    protected abstract void triage(Disease disease);
    protected abstract void consult(Disease disease);

    protected void showResult(String result) {
        System.out.println(result);
    }
}
