package com.shaurya.quantitymeasurement;

import java.util.Objects;

import com.shaurya.quantitymeasurement.Length.LengthUnit;

public class QuantityMeasurementApp {
	public static void comparision(String temp, Length l1, Length l2) {
		if(l1.equals(l2)) {
			System.out.println(temp+ " is equals");
		}
		else {
			System.out.println(temp+" is not equals");
		}
	}
	public static void demonstrateFeetEquality() {
		Length length1 = new Length(1.0, LengthUnit.FEET);
		Length length2 = new Length(12.0, LengthUnit.INCHES);
		comparision("Feet" , length1, length2);
	}
	public static void demonstrateInchesEquality() {
		Length length1 = new Length(1.0, LengthUnit.FEET);
		Length length2 = new Length(12.0, LengthUnit.INCHES);
		comparision("Inches" , length1, length2);
	}
	public static void demonstrateFeetInchesComparision() {
		Length length1 = new Length(1.0, LengthUnit.FEET);
		Length length2 = new Length(12.0, LengthUnit.INCHES);
		System.out.println("Are they equals? "+ length1.equals(length2));
	}
	
	public static class Feet{
		private final double value;
		
		public Feet(double value) {
			this.value=value;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(this==obj) return true;
			if(obj==null || getClass()!=obj.getClass()) return false;
			Feet other=(Feet) obj;
			return Double.compare(this.value, other.value)==0;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(value);
		}
	}

	public static void main(String[] args) {
		demonstrateFeetEquality();
		demonstrateInchesEquality();
		demonstrateFeetInchesComparision();
	}
	public static class Inches{
private final double value;
		
		public Inches(double value) {
			this.value=value;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(this==obj) return true;
			if(obj==null || getClass()!=obj.getClass()) return false;
			Inches other=(Inches) obj;
			return Double.compare(this.value, other.value)==0;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(value);
		}
	}	
	}

