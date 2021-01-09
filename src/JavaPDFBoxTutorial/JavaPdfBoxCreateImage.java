package JavaPDFBoxTutorial;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class JavaPdfBoxCreateImage {

	public static void main(String[] args) throws IOException {
		try (PDDocument doc = new PDDocument()) {
			
			PDPage myPage = new PDPage();
			doc.addPage(myPage);
			
			String imgFileName = "F:\\AUTRES\\kabylie.jpg";
			PDImageXObject pdImage = PDImageXObject.createFromFile(imgFileName, doc);
			
			int iw = pdImage.getWidth();
			int ih = pdImage.getHeight();
			
			float offset = 20f;
			
			try(PDPageContentStream cont = new PDPageContentStream(doc, myPage)) {
				cont.drawImage(pdImage, offset, offset, iw, ih);
			}
			
			doc.save("F:\\AUTRES\\kabylie.pdf");
		}

	}

}
