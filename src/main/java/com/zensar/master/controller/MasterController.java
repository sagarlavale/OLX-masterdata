package com.zensar.master.controller;

import com.zensar.master.dto.CategoryListDto;
import com.zensar.master.dto.StatusListDto;
import com.zensar.master.service.MasterService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class MasterController {
	
	@Autowired
	MasterService masterService;

	@PostMapping(value = "/category" , consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "Creates All Categories", notes =  "This Service Creates Master Product Categories of OLX Application",hidden = true)
	@ResponseBody
	public ResponseEntity<?> post(@RequestBody CategoryListDto dto) {
		return masterService.post(dto);
		
	}

	@PostMapping(value = "/status" , consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "Creates All Statuses", notes =  "This Service Creates Master Statuses of OLX Application",hidden = true)
	@ResponseBody
	public ResponseEntity<?> post(@RequestBody StatusListDto dto) {
		return masterService.post(dto);

	}
	
	@GetMapping(value = "/category" , produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "Returns All Categories", notes =  "This Service Returns List of All Product Categories of OLX Application")
	@ResponseBody
	public ResponseEntity<?> getCategories() {
		return masterService.getCategories();
		
	}

	@GetMapping(value = "/category/{categoryId}" , produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "Returns All Categories", notes =  "This Service Returns List of All Product Categories of OLX Application")
	@ResponseBody
	public ResponseEntity<?> getCategory(@PathVariable Integer categoryId) {
		return masterService.getCategory(categoryId);

	}
	
	@GetMapping(value = "/status" ,produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "Returns All Status", notes =  "THis Service Returns List of All Ad Status of OLX Application")
	@ResponseBody
	public ResponseEntity<?> getStatus() {
		return masterService.getStatus();
	}

	@GetMapping(value = "/status/{statusId}" , produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "Returns All Categories", notes =  "This Service Returns List of All Product Categories of OLX Application")
	@ResponseBody
	public ResponseEntity<?> getStatus(@PathVariable Integer statusId) {
		return masterService.getStatus(statusId);

	}

}
