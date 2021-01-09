package JavaPDFBoxTutorial;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class JavaPdfBoxReadText {

	public static void main(String[] args) throws IOException {
		
		File myFile = new File("F:\\AUTRES\\wwii.pdf");
		try (PDDocument doc = PDDocument.load(myFile) ) {
			PDFTextStripper stripper = new PDFTextStripper();
			String text = stripper.getText(doc);
			
			System.out.println("Text size : " + text.length() + " charcters : ");
			System.out.println(text);
			
			
		}

	}

}
