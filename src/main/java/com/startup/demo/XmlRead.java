package com.startup.demo;

import java.io.IOException;
//import com.mkyong.xml.sax.handler.PrintAllHandlerSax;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlRead {
	public static void main(String[] args) {
		try   
		{  
		SAXParserFactory factory = SAXParserFactory.newInstance();  
		SAXParser saxParser = factory.newSAXParser();  
		DefaultHandler handler = new DefaultHandler()   
		{  
		boolean objects = false;  
		boolean object = false;  
		boolean property = false;  
		boolean PropertyName = false;  
		boolean marks = false;  
		//parser starts parsing a specific element inside the document    
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException   
		{  
		System.out.println("Start Element :" + qName);  
		if(qName.equalsIgnoreCase("objects"))  
		{  
			objects=true;  
		}  
		if (qName.equalsIgnoreCase("object"))   
		{  
			object = true;  
		}  
		if (qName.equalsIgnoreCase("property"))   
		{  
			property = true;  
		}  
		if (qName.equalsIgnoreCase("PropertyName"))   
		{  
			PropertyName = true;  
		}  
//		if (qName.equalsIgnoreCase("MARKS"))   
//		{  
//		marks = true;  
//		}  
		}  
		//parser ends parsing the specific element inside the document  
		public void endElement(String uri, String localName, String qName) throws SAXException   
		{  
		System.out.println("End Element:" + qName);  
		}  
		//reads the text value of the currently parsed element  
		public void characters(char ch[], int start, int length) throws SAXException   
		{  
		if (object)   
		{  
		System.out.println("ID : " + new String(ch, start, length));  
		object = false;  
		}  
		if (objects)   
		{  
		System.out.println("First Name: " + new String(ch, start, length));  
		objects = false;  
		}  
		if (property)   
		{  
		System.out.println("Last Name: " + new String(ch, start, length));  
		property = false;  
		}  
		if (PropertyName)  
		{  
		System.out.println("Subject: " + new String(ch, start, length));  
		PropertyName = false;  
		}  
//		if (marks)   
//		{  
//		System.out.println("Marks : " + new String(ch, start, length));  
//		marks = false;  
//		}  
		}  
		};  
		saxParser.parse("C:\\Users\\navnath.kalhatkar\\Downloads\\SAX\\DellParser\\DellXML", handler);  
		}   
		catch (Exception e)   
		{  
		e.printStackTrace();  
		}  
		}  
	}

