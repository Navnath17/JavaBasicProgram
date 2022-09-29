package com.startup.demo;

import java.util.HashMap;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DellHandler extends DefaultHandler {
	
	boolean objects  = false;
	boolean object  = false;
	boolean property  = false;
	boolean PropertyName = false;
	HashMap<String, String> map= new HashMap<>();
	@Override
	public void startDocument() throws SAXException {
		System.out.println("--------Dell XML---------------"); 
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("End Document"); 
	}
String value = null;
String key= null;

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		value = new String(ch,start,length);
		System.out.print("="+ value);
//		map.put(key, value);
//		System.out.println(map);
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(attributes.getLength() > 0) {
			
		
			
			 for(int i=0;i<attributes.getLength();i++) {
				 
//				 if(i!=attributes.getValue(i).length()-1)
				
//					 System.out.print("\""+attributes.getValue()[i]+"\",");
				 key = attributes.getValue(i);
				System.out.print(key);
				 
			 }
		}else {
			System.out.print("Start Element :"+qName);
			
			}	
	}

}
