package com.shaurya.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

	@Test
	void testFeetEquality_SameValue() {
		QuantityMeasurementApp.Feet f1=new QuantityMeasurementApp.Feet(1.0);
		QuantityMeasurementApp.Feet f2=new QuantityMeasurementApp.Feet(1.0);
		
		assertTrue(f1.equals(f2));
	}
	
	@Test
	void testFeetEquality_DifferentValue() {
		QuantityMeasurementApp.Feet f1=new QuantityMeasurementApp.Feet(68.0);
		QuantityMeasurementApp.Feet f2=new QuantityMeasurementApp.Feet(88.0);
		
		assertFalse(f1.equals(f2));
	}
	
	@Test
	void testFeetEquality_NullComparison() {
		QuantityMeasurementApp.Feet f1=new QuantityMeasurementApp.Feet(68.0);
		
		assertFalse(f1.equals(null));
	}
	
	@Test
	void testFeetEquality_NonNumericInput() {
		QuantityMeasurementApp.Feet f1=new QuantityMeasurementApp.Feet(68.0);
		
		assertFalse(f1.equals("68"));
	}
	
	@Test
	void testFeetEquality_SameReference() {
		QuantityMeasurementApp.Feet f1=new QuantityMeasurementApp.Feet(68.0);
		
		assertTrue(f1.equals(f1));
	}
	
	@Test
    void testFeetEquality_Consistent() {
		QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
		QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(1.0);

        assertTrue(f1.equals(f2));
        assertTrue(f1.equals(f2));
        assertTrue(f1.equals(f2));
    }

	@Test
	void testInchEquality_SameValue() {
		QuantityMeasurementApp.Inches f1=new QuantityMeasurementApp.Inches(1.0);
		QuantityMeasurementApp.Inches f2=new QuantityMeasurementApp.Inches(1.0);
		
		assertTrue(f1.equals(f2));
	}
	
	@Test
	void testInchEquality_DifferentValue() {
		QuantityMeasurementApp.Inches f1=new QuantityMeasurementApp.Inches(68.0);
		QuantityMeasurementApp.Inches f2=new QuantityMeasurementApp.Inches(88.0);
		
		assertFalse(f1.equals(f2));
	}
	
	@Test
	void testInchEquality_NullComparison() {
		QuantityMeasurementApp.Inches f1=new QuantityMeasurementApp.Inches(68.0);
		
		assertFalse(f1.equals(null));
	}
	
	@Test
	void testInchEquality_NonNumericInput() {
		QuantityMeasurementApp.Inches f1=new QuantityMeasurementApp.Inches(68.0);
		
		assertFalse(f1.equals("68"));
	}
	
	@Test
	void testInchEquality_SameReference() {
		QuantityMeasurementApp.Inches f1=new QuantityMeasurementApp.Inches(68.0);
		
		assertTrue(f1.equals(f1));
	}
	
	@Test
    void testInchEquality_Consistent() {
		QuantityMeasurementApp.Inches f1 = new QuantityMeasurementApp.Inches(1.0);
		QuantityMeasurementApp.Inches f2 = new QuantityMeasurementApp.Inches(1.0);

        assertTrue(f1.equals(f2));
        assertTrue(f1.equals(f2));
        assertTrue(f1.equals(f2));
    }

}