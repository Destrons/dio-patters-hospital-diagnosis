import diseases.Disease;
import factory.DiseaseFactory;
import process.StandardMedicalProcess;
import diagnosis.SimpleDiagnosis;
import record.ResultRegistry;

public class Main {
    public static void main(String[] args) {
        var diagnosis = new SimpleDiagnosis();
        var process = new StandardMedicalProcess(diagnosis);

        Disease d1 = DiseaseFactory.createDisease("gripe");
        Disease d2 = DiseaseFactory.createDisease("sinusite");
        Disease d3 = DiseaseFactory.createDisease("gastrite");

        process.process(d1);
        process.process(d2);
        process.process(d3);

        ResultRegistry.getInstance().showAll();
    }
}