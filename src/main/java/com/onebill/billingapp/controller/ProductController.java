package com.onebill.billingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebill.billingapp.dto.ResponseDTO;
import com.onebill.billingapp.entities.Services;
import com.onebill.billingapp.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
//	@PostMapping("/product")
//	public ResponseDTO addCompany(@RequestBody Company company) {
//		ResponseDTO response=new ResponseDTO();
//		response.setData(companyService.addCompany(company));
//		return response;
//	}
	
	@PostMapping("/service")
	public ResponseDTO addService(@RequestBody Services service) {
		ResponseDTO response=new ResponseDTO();
		response.setData(productService.addService(service));
		return response;
	}
	
	@DeleteMapping("/service/{serviceId}")
	public ResponseDTO deleteService(@PathVariable int serviceId) {
		ResponseDTO response=new ResponseDTO();
		response.setData(productService.deleteService(serviceId));
		return response;
	}
	
	@GetMapping("/{serviceId}")
	public ResponseDTO getService(@PathVariable int serviceId) {
		ResponseDTO response=new ResponseDTO();
		response.setData(productService.getService(serviceId));
		return response;
	}	
	
	@PutMapping("/manage-product")
	public ResponseDTO updatePlan(@RequestBody Services service) {
		ResponseDTO response=new ResponseDTO();
		response.setData(productService.updateService(service));
		return response;
	}

}
