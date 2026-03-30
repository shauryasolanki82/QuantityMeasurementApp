package com.shaurya.quantitymeasurement.repository;


import com.shaurya.quantitymeasurement.entity.QuantityMeasurementEntity;

public interface IQuantityMeasurementRepository {
	
	void save(QuantityMeasurementEntity entity);
	
}
