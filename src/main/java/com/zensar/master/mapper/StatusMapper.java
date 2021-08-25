package com.zensar.master.mapper;

import com.zensar.master.dto.StatusDto;
import com.zensar.master.entity.Status;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface StatusMapper {

    StatusDto toStatusDto(Status status);

    Status toStatus(StatusDto statusDto);

    List<StatusDto> toStatusDtoList(List<Status> statuses);

    List<Status> toStatusList(List<StatusDto> statusList);
}
