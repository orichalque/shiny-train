package fr.univnantes.alma.dsl.dart.design.service;


public class FileType {
	
	public boolean isHtml(String name) {
		
		if (name.endsWith(".html")) {
			return true;
		} else {
			return false;
		}
	}
}