package com.example.CrudNoDatabase.Service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.CrudNoDatabase.Model.CRUDProperty;

@Service
public class CRUDImpl implements CRUDInterface{
	
	private List<CRUDProperty> user =new ArrayList<>();

	@Override
	public List<CRUDProperty> getAllProperty() {
		
		return user;
	}

	@Override
	public void createData(CRUDProperty property) {
		property.setId(property.getId());
        user.add(property);
	}

	@Override
	public CRUDProperty getById(Integer id) {
		return user.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
	}

	@Override
	public void deleteById(Integer id) {
		CRUDProperty byId = getById(id);
		if(byId != null)
		{
			user.remove(byId);
		}
	}

	@Override
	public void updateDetail(Integer id, CRUDProperty crud) {
		CRUDProperty byId = getById(id);
		if(byId != null)
		{
			byId.setName(crud.getName());
			byId.setEmail(crud.getEmail());
		}
	}
	

}
