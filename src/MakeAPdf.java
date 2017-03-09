import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class MakeAPdf {
	public static void main(String[] args){
		Document document=new Document();
		try{
			PdfWriter.getInstance(document, new FileOutputStream("APDF.pdf"));
			document.open();
			Paragraph paragraph=new Paragraph();
			paragraph.add("A Paragraph");
			document.add(paragraph);
			document.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
