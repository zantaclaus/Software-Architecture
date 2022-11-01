import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        /*
         * taught by : 63010035 Kitsadang Sawangsiripol
         */

        // Current usage
        // BookMetadataFormatter formatter = null;
        // try {
        // formatter =
        // BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.CSV);
        // formatter.append(TestData.dragonBook);
        // formatter.append(TestData.dinosaurBook);
        // System.out.print(formatter.getMetadataString());
        // } catch (IOException e) {
        // e.printStackTrace();
        // } catch (ParserConfigurationException e) {
        // e.printStackTrace();
        // }

        // Expected usage
        BookMetadataExporter exporter = new CSVBookMetadataExporter();
        // BookMetadataExporter exporter = new XMLBookMetadataExporter();
        // BookMetadataExporter exporter = new JSONBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.add(TestData.cleanArchBook);
        exporter.add(TestData.dinosaurBook);
        exporter.add(TestData.dragonBook);
        exporter.export(System.out);
    }
}
