package com.example.CrudNoDatabase.Service;

import java.util.List;

import com.example.CrudNoDatabase.Model.CRUDProperty;

public interface CRUDInterface {
	
	List<CRUDProperty> getAllProperty();
	
	public void createData(CRUDProperty property);
	
	public CRUDProperty getById(Integer id);
	
	public void deleteById(Integer id);
	
	public void updateDetail(Integer id, CRUDProperty crud);

}
