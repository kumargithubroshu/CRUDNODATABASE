package com.example.CrudNoDatabase.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudNoDatabase.Model.CRUDProperty;
import com.example.CrudNoDatabase.Service.CRUDImpl;

@RestController
@RequestMapping("/CRUDProperty")
public class CRUDController {
	
	private CRUDImpl crudService;

	@Autowired
	public CRUDController(CRUDImpl crudService) {
		this.crudService = crudService;
	}
	
	@GetMapping("/getdata")
	public List<CRUDProperty> getDetails()
	{
		List<CRUDProperty> allProperty = crudService.getAllProperty();
		return allProperty;
	}
	
	@PostMapping("/create")
	public void createData(@RequestBody CRUDProperty model)
	{
		crudService.createData(model);
	}
	
	@GetMapping("/getdata/{id}")
	public CRUDProperty getRecordById(@PathVariable Integer id)
	{
		return crudService.getById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteRecord(@PathVariable Integer id)
	{
		crudService.deleteById(id);
	}
	
	@PutMapping("/update/{id}")
	public void updateDetail(@PathVariable Integer id, @RequestBody CRUDProperty propert)
	{
		crudService.updateDetail(id, propert);
	}
	
	

}
