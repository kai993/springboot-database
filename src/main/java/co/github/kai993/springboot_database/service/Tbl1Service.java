package co.github.kai993.springboot_database.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.github.kai993.springboot_database.mapper.Tbl1Mapper;
import co.github.kai993.springboot_database.model.Tbl1Dto;
import co.github.kai993.springboot_database.repository.Tbl1Repository;

@Service
public class Tbl1Service {
    private final Tbl1Repository repository;
    private final Tbl1Mapper mapper;

    public Tbl1Service(Tbl1Repository repository, Tbl1Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<Tbl1Dto> getAllData() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
}
