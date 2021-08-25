package com.zensar.master.dto;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Contains the List of Product Categories on OLX Application")
public class CategoryListDto {
	@ApiModelProperty(value = "List of Categories")
	private List<CategoryDto> categories;
}
