package com.startup.demo;

public class Costcodemaker {
	
	public static void main(String[] args) {
	
		String code = "01-02-03-04-05-06-07-08-09";
		int level=4;
		int seg=1;
		getCostCode(code,level,seg);
	}
	
	private static String getCostCode(String costCode,int level,int seg) {
		String arr[] = costCode.split("[-]");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < level; i++) {

			
			for (int j = 0; j < seg; j++) {

				if(j!= 0) {
					sb.append('.');	
				}
				if(i >= j) {
					sb.append(arr[j]);	
				}else {
					sb.append("00");
				}	
			}
			if(i < level-1) {
			sb.append("--");
			}
		}
		System.out.println(sb.toString());

		return sb.toString();
	}

}
