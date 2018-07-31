package com.xiaolv.test.algorithm;

import java.text.DecimalFormat;

public class FloatCalculate {

	public String sizeConvert(Float space, String showname) {
		String result;
		DecimalFormat formatter;
		// = new DecimalFormat("0.00");
		String type;
		float gb;
		if (space >= 1000 * 1024 * 1024L) {
			gb = space / (1024 * 1024 * 1024L);
			// result = formatter.format(gb) + "G";
			type = "G";
		} else if (space >= 1000 * 1024L) {
			gb = space / (1024 * 1024L);
			// result = formatter.format(gb) + "M";
			type = "M";
		} else if (space >= 1000L) {
			gb = space / 1024L;
			type = "K";
		} else {
			gb = space;
			type = "";
		}
		if (showname.equals("ÁªÏµÈË")) {
			formatter = new DecimalFormat("0");
		} else {

			if (gb >= 100) {
				formatter = new DecimalFormat("0");
			} else if (gb >= 10) {
				formatter = new DecimalFormat("0.0");
			} else if (gb > 0) {
				formatter = new DecimalFormat("0.00");
			} else {
				formatter = new DecimalFormat("0");
			}
		}// 1211
			// if (gb >= 100) {
		// formatter = new DecimalFormat("0");
		// } else if (gb >= 10) {
		// formatter = new DecimalFormat("0.0");
		// } else if (gb > 0){
		// formatter = new DecimalFormat("0.00");
		// } else {
		// formatter = new DecimalFormat("0");
		// }

		result = formatter.format(gb) + type;
		return result;
	}
	
	public FloatCalculate() {
	}
	
	public static void main(String ... args){
		
		FloatCalculate fCalculate = new FloatCalculate();
		
		String resultString = fCalculate.sizeConvert(2308162150f, "notepad");
		
		System.out.println("resultString=" + resultString);
	}

}
