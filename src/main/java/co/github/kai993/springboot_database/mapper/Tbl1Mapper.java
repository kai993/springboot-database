package co.github.kai993.springboot_database.mapper;

import org.mapstruct.Mapper;

import co.github.kai993.springboot_database.model.Tbl1;
import co.github.kai993.springboot_database.model.Tbl1Dto;

@Mapper(componentModel = "spring")
public interface Tbl1Mapper {
    Tbl1Dto toDto(Tbl1 tbl1);
    Tbl1 toEntity(Tbl1Dto tbl1Dto);
}

