package com.java.exercises.operations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;

public class JavaPdfHelloWorld {

	public static void main(String[] args) throws MalformedURLException, IOException {
		Document document = new Document();
		String cliente = "Raymundo";
		LocalDate date = LocalDate.now();
		String totalSale = "2500.00";
		List<String> products = new ArrayList<>();
		products.add("Producto 1");
		products.add("Producto 2");
		products.add("Producto 3");
		products.add("Producto 4");
		products.add("Producto 5");
		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("ReporteVenta.pdf"));
			document.open();
			
			Image imgTesci = Image.getInstance("TESCI.jpg");
			imgTesci.setAbsolutePosition(450f, 700f);
			Image imgJava = Image.getInstance("Java.jpg");
			document.add(imgTesci);
			document.add(new Paragraph("\n \n \n \n \n \n"));
			document.add(new Paragraph("Reporte de Venta"));
			document.add(new Paragraph("\n"));
			document.add(new Paragraph("Cliente: "+cliente));
			document.add(new Paragraph("\n"));
			document.add(new Paragraph("Fecha: "+date));
			document.add(new Paragraph("\n"));
			document.add(new Paragraph("Prodcutos:"));
			for(String prod: products) {
				document.add(new Paragraph(prod));
			}
			document.add(new Paragraph("Total: "+totalSale));
			document.add(new Paragraph("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"));
			document.add(imgJava);
			document.add(new Paragraph("By Engr. Raymundo Ramírez Parra"));
			document.add(new Paragraph("Java Professional Developer"));
			document.close();
			writer.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
