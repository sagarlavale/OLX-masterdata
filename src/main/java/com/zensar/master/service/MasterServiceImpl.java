package com.zensar.master.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.zensar.master.dto.CategoryDto;
import com.zensar.master.dto.StatusDto;
import com.zensar.master.entity.Status;
import com.zensar.master.exception.CategoryNotFoundException;
import com.zensar.master.mapper.StatusMapper;
import com.zensar.master.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.zensar.master.dto.CategoryListDto;
import com.zensar.master.dto.StatusListDto;
import com.zensar.master.entity.Category;
import com.zensar.master.mapper.CategoryMapper;
import com.zensar.master.repository.CategoryRepository;

@Service
public class MasterServiceImpl implements MasterService{
	
	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	CategoryMapper categoryMapper;

	@Autowired
	StatusMapper statusMapper;

	@Autowired
	StatusRepository statusRepository;

	@Override
	public ResponseEntity<?> post(CategoryListDto dto) {
		List<Category> categories = categoryMapper.toCategoryList(dto.getCategories());
		categoryRepository.saveAll(categories);
		return ResponseEntity.ok(new CategoryListDto(categoryMapper.toCategoryDtoList(categories)));
	}

	@Override
	public ResponseEntity<?> post(StatusListDto dto) {
		List<Status> statuses = statusMapper.toStatusList(dto.getStatusList());
		statusRepository.saveAll(statuses);
		return ResponseEntity.ok(new StatusListDto(statusMapper.toStatusDtoList(statuses)));
	}

	@Override
	public ResponseEntity<?> getCategories() {
		return ResponseEntity.ok(new CategoryListDto(categoryMapper.toCategoryDtoList(categoryRepository.findAll())));
	}

	@Override
	public ResponseEntity<?> getCategory(Integer categoryId) {
		Optional<Category> optional = categoryRepository.findById(categoryId);
		if (optional.isPresent())
			return ResponseEntity.ok(categoryMapper.toCategoryDto(optional.get()));
		else
			throw new CategoryNotFoundException(categoryId);
	}

	@Override
	public ResponseEntity<?> getStatus() {
		return ResponseEntity.ok(new StatusListDto(statusMapper.toStatusDtoList(statusRepository.findAll())));
	}

	@Override
	public ResponseEntity<?> getStatus(Integer statusId) {
		Optional<Status> optional = statusRepository.findById(statusId);
		if (optional.isPresent())
			return ResponseEntity.ok(statusMapper.toStatusDto(optional.get()));
		else
			throw new CategoryNotFoundException(statusId);
	}
	

}
