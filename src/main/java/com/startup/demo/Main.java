package com.startup.demo;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Main {
public static void main(String[] args) {
	SAXParserFactory factory = SAXParserFactory.newInstance();
	 factory.setValidating(true);
	 try {
	   SAXParser saxParser = factory.newSAXParser();
	   File file = new File("C:\\Users\\navnath.kalhatkar\\Downloads\\SAX\\DellParser\\DellXML");
	   saxParser.parse(file, new DellHandler());    // specify handler
	 }
	 catch(ParserConfigurationException e1) {
	 }
	 catch(SAXException e1) {
	 }
	 catch(IOException e) {
	 }
}
}
