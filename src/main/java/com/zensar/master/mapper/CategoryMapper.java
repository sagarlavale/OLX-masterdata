package com.zensar.master.mapper;

import com.zensar.master.dto.CategoryDto;
import com.zensar.master.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface CategoryMapper {

	CategoryDto toCategoryDto(Category category);
	
	Category toCategory(CategoryDto categoryDto);

	List<CategoryDto> toCategoryDtoList(List<Category> categories);
	
	List<Category> toCategoryList(List<CategoryDto> categoryListDto);
}
