package com.shaurya.quantitymeasurement.repository;
import java.util.ArrayList;
import java.util.List;

import com.shaurya.quantitymeasurement.entity.QuantityMeasurementEntity;

public class QuantityMeasurementCacheRepository implements IQuantityMeasurementRepository {
	
	private List<QuantityMeasurementEntity> storage= new ArrayList<>();
	
	@Override 
	public void save(QuantityMeasurementEntity entity) {
		storage.add(entity);
		System.out.println("Saved: "+entity);
	}

}
