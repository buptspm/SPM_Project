package com.buptsse.spm.util;

public class FishingCheckUtil {
	static String[] htmlTab = {"<", ">", "\""};
	static String[] tabTrans = {"&lt;", "&gt;", "&quot;"};
	
	public static String checkChar(String oldStr){
		if(oldStr == null) return null;
		String newStr = new String(oldStr);
		for(int i = 0; i < htmlTab.length; i++){
			newStr = newStr.replace(htmlTab[i], tabTrans[i]);
		}
		return newStr;
	}

}
