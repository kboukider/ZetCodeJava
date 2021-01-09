package JavaPDFBoxTutorial;

import java.io.IOException;
import java.util.Calendar;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;

public class JavaPdfBoxDocumentInformation {

	public static void main(String[] args) throws IOException {
		try (PDDocument doc = new PDDocument()) {

            PDPage myPage = new PDPage();
            doc.addPage(myPage);

            PDDocumentInformation pdi = doc.getDocumentInformation();
            
            pdi.setAuthor("Jan Bodnar");
            pdi.setTitle("World war II");
            pdi.setCreator("Java code");
            
            Calendar date = Calendar.getInstance();
            pdi.setCreationDate(date);
            pdi.setModificationDate(date);

            pdi.setKeywords("World war II, conflict, Allies, Axis powers");

            doc.save("F:\\AUTRES\\kabylie2.pdf");
        }
    }
}