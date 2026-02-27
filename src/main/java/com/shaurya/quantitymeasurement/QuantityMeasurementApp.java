package com.shaurya.quantitymeasurement;

import java.util.Objects;

import com.shaurya.quantitymeasurement.Length.LengthUnit;

public class QuantityMeasurementApp {
		public static boolean demonstrateLengthComparision(Length length1, Length length2) {
			if(length1.equals(length2)) {
				return true;
			}
			return false;
		}
	public static void main(String[] args) {
		System.out.println("are they equals "+demonstrateLengthComparision(new Length(1.0, LengthUnit.FEET), new Length(12.0, LengthUnit.INCHES)));
		
		System.out.println("are they equals "+demonstrateLengthComparision(new Length(1.0, LengthUnit.YARDS), new Length(36.0, LengthUnit.INCHES)));
	
		System.out.println("are they equals "+demonstrateLengthComparision(new Length(100.0, LengthUnit.CENTIMETERS), new Length(39.3701, LengthUnit.INCHES)));
		
	}
	}

