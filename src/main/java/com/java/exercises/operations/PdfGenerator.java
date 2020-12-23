package com.java.exercises.operations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;


public class PdfGenerator {

	  public static void main(String[] args) throws Exception {
	        try (PDDocument document = new PDDocument()) {
	        	String cliente="Raymundo";
	        	LocalDate date = LocalDate.now();
	        	String totalSale = "2500.00";
	        	List<String> products = new ArrayList<>();
	        	products.add("Producto 1");
	        	products.add("Producto 2");
	        	products.add("Producto 3");
	        	products.add("Producto 4");
	        	products.add("Producto 5");
	        	
	            PDPage page = new PDPage(PDRectangle.A6);
	            document.addPage(page);

	            PDPageContentStream contentStream = new PDPageContentStream(document, page);

	            // Text
	            contentStream.beginText();
	            contentStream.setFont(PDType1Font.TIMES_BOLD, 12);
	            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 52);
	            contentStream.showText("Registro de Venta ");
	            contentStream.newLineAtOffset( 21, page.getMediaBox().getHeight() - 52);
	            contentStream.showText("Cliente: "+cliente +" "+
	    	            "Fecha: "+date +" "+
	    	            "Total Venta"+totalSale+" "+
	    	            "Productos vendidos: "+products);
	            contentStream.endText();

	            // Image
	            PDImageXObject image = PDImageXObject.createFromFile("/home/armando/Documents/CursoJava/EjerciciosJava/excersices/src/main/java/com/java/exercises/operations/Java.jpg", document);
	            contentStream.drawImage(image, 20, 20, image.getWidth() / 3, image.getHeight() / 3);

	            contentStream.close();

	            document.save("document.pdf");
	            System.out.println("Done!");
	        }
	    }
}
