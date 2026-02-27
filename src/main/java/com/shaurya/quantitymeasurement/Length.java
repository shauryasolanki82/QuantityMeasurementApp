package com.shaurya.quantitymeasurement;

public class Length {
	private double value;
	private LengthUnit unit;
	private static final double EPSILON=0.0001;
	public enum LengthUnit{
		FEET(12.0),
		INCHES(1.0),
		YARDS(36.0),
		CENTIMETERS(0.393701);
		private final double conversionFactor;
		
		
		LengthUnit(double conversionFactor){
			this.conversionFactor = conversionFactor;
		}
		
		public double getConversionFactor() {
			return conversionFactor;
		}
	}
		
		public Length(double value, LengthUnit unit) {
			this.value = value;
			this.unit = unit;
		}
		private double convertToBaseUnit() {
			
			return value*unit.getConversionFactor();
		}
		@Override
		public boolean equals(Object obj) {
			if(this==obj) {
				return true;
			}
			if(obj==null || this.getClass()!=obj.getClass()) {
				return false;
			}
			Length length = (Length)(obj);
			return Math.abs(this.convertToBaseUnit() - length.convertToBaseUnit())<EPSILON;
		}
		@Override
		public int hashCode() {
			return Double.hashCode(convertToBaseUnit());
		}

		}
