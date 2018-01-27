package com.ex;

public class StrinEx {

	public static void main(String[] args) {
		String deviceStr = "DEVICE_01584732-c710-4fac-bc82-915624b25642";
		String deviceFieldsStr = "DEVICE_01584732-c710-4fac-bc82-915624b25642_deviceConfig";
		String storeStr = "STORE_5955";
		String featuresStr = "FEATURES_5955_SNAP_SELL";
		System.out.println(deviceStr.substring(7, deviceStr.length()));
		System.out.println(deviceFieldsStr.substring(7, deviceFieldsStr.lastIndexOf('_')));
		System.out.println(deviceFieldsStr.substring(deviceFieldsStr.lastIndexOf('_') + 1, deviceFieldsStr.length()));
		
		System.out.println();
	}

}
