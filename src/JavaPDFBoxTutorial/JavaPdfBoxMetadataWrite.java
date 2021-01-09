package JavaPDFBoxTutorial;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDMetadata;

public class JavaPdfBoxMetadataWrite {

	public static void main(String[] args) throws IOException {
		try (PDDocument doc = new PDDocument()) {
			
			PDPage myPage = new PDPage();
			
			File myFile = new File("F:\\AUTRES\\metadata.xml");
			try (InputStream is = Files.newInputStream(myFile.toPath())) {
				
				PDMetadata meta = new PDMetadata(doc, is);
				PDDocumentCatalog catalog = doc.getDocumentCatalog();
				catalog.setMetadata(meta);
				
				doc.addPage(myPage);
			}
			doc.save("F:\\AUTRES\\metadata.pdf");
		}

	}

}
