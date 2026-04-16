package com.shaurya.quantitymeasurement.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(
		name="quantity_measurement_entity",
		indexes= {
			@Index(name="idx_operation", columnList="operation"),
			@Index(name="idx_meas_type", columnList="thisMeasurementType"),
			@Index(name="idx_created_at", columnList="createdAt"),
			@Index(name="idx_is_error", columnList="isError")
		})
public class QuantityMeasurementEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private Double thisValue;
	
	@Column(nullable=false)
	private String thisUnit;
	
	@Column(nullable=false)
	private String thisMeasurementType;
	
	@Column(nullable=false)
	private Double thatValue;
	
	@Column(nullable=false)
	private String thatUnit;
	
	@Column(nullable=false)
	private String thatMeasurementType;
	
	@Column(nullable=false)
	private String operation;
	
	private Double resultValue;
	private String resultUnit;
	private String resultMeasurementType;
	private String resultString;
	
	private String errorMessage;
	private boolean isError=false;
	
	@Column(updatable=false)
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;

    public QuantityMeasurementEntity() {}

    public QuantityMeasurementEntity(Long id, Double thisValue, String thisUnit, String thisMeasurementType, Double thatValue, String thatUnit, String thatMeasurementType, String operation, Double resultValue, String resultUnit, String resultMeasurementType, String resultString, String errorMessage, boolean isError, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.thisValue = thisValue;
        this.thisUnit = thisUnit;
        this.thisMeasurementType = thisMeasurementType;
        this.thatValue = thatValue;
        this.thatUnit = thatUnit;
        this.thatMeasurementType = thatMeasurementType;
        this.operation = operation;
        this.resultValue = resultValue;
        this.resultUnit = resultUnit;
        this.resultMeasurementType = resultMeasurementType;
        this.resultString = resultString;
        this.errorMessage = errorMessage;
        this.isError = isError;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getThisValue() { return thisValue; }
    public void setThisValue(Double thisValue) { this.thisValue = thisValue; }

    public String getThisUnit() { return thisUnit; }
    public void setThisUnit(String thisUnit) { this.thisUnit = thisUnit; }

    public String getThisMeasurementType() { return thisMeasurementType; }
    public void setThisMeasurementType(String thisMeasurementType) { this.thisMeasurementType = thisMeasurementType; }

    public Double getThatValue() { return thatValue; }
    public void setThatValue(Double thatValue) { this.thatValue = thatValue; }

    public String getThatUnit() { return thatUnit; }
    public void setThatUnit(String thatUnit) { this.thatUnit = thatUnit; }

    public String getThatMeasurementType() { return thatMeasurementType; }
    public void setThatMeasurementType(String thatMeasurementType) { this.thatMeasurementType = thatMeasurementType; }

    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }

    public Double getResultValue() { return resultValue; }
    public void setResultValue(Double resultValue) { this.resultValue = resultValue; }

    public String getResultUnit() { return resultUnit; }
    public void setResultUnit(String resultUnit) { this.resultUnit = resultUnit; }

    public String getResultMeasurementType() { return resultMeasurementType; }
    public void setResultMeasurementType(String resultMeasurementType) { this.resultMeasurementType = resultMeasurementType; }

    public String getResultString() { return resultString; }
    public void setResultString(String resultString) { this.resultString = resultString; }

    public String getErrorMessage() { return errorMessage; }
    public void setErrorMessage(String errorMessage) { this.errorMessage = errorMessage; }

    public boolean isError() { return isError; }
    public void setError(boolean error) { isError = error; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
	
	@PrePersist
	protected void onCreate() {
		createdAt=LocalDateTime.now();
		updatedAt=LocalDateTime.now();
	}
	
	@PreUpdate
	protected void onUpdate() {
		updatedAt=LocalDateTime.now();
	}
}