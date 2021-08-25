package com.zensar.master.service;

import com.zensar.master.dto.CategoryDto;
import com.zensar.master.dto.CategoryListDto;
import com.zensar.master.dto.StatusDto;
import com.zensar.master.dto.StatusListDto;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface MasterService {

	ResponseEntity<?> post(CategoryListDto dto);

	ResponseEntity<?> post(StatusListDto dto);

	ResponseEntity<?> getCategories();

	ResponseEntity<?> getCategory(Integer categoryId);

	ResponseEntity<?> getStatus(Integer categoryId);

	ResponseEntity<?> getStatus();
	
	
}
