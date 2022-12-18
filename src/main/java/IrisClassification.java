
import org.datavec.api.records.reader.RecordReader;
import org.datavec.api.records.reader.impl.csv.CSVRecordReader;
import org.datavec.api.split.FileSplit;
import org.nd4j.linalg.io.ClassPathResource;
public class IrisClassification {
    public static void main(String[] args) {

        RecordReader recordReader = new CSVRecordReader(0, ',');
        try {
            recordReader.initialize(new FileSplit(new ClassPathResource("iris.csv").getFile()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
