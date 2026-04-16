package com.shaurya.quantitymeasurement.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class QuantityDTO {
	
	@NotNull(message="Value must not be null")
	private Double value;
	
	@NotEmpty(message="Unit must not be empty")
	private String unit;
	
	@NotEmpty(message="Measurement type must not be empty")
	private String measurementType;

    public QuantityDTO() {}

    public QuantityDTO(Double value, String unit, String measurementType) {
        this.value = value;
        this.unit = unit;
        this.measurementType = measurementType;
    }

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }

    public String getMeasurementType() { return measurementType; }
    public void setMeasurementType(String measurementType) { this.measurementType = measurementType; }	
	
}