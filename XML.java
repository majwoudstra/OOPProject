package com.gs.xmlparser;

public class XML extends readXML {

	
	 public void LoadXML(String name, division div){
		 LoadXMLFile(div, name);
	 }
	 public void WriteXML(String outfile, division div){
		 SaveXMLFile(div, outfile);
	 }
}
