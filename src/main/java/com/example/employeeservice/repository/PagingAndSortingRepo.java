package com.example.employeeservice.repository;

import com.example.employeeservice.domain.entity.Employee;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagingAndSortingRepo extends PagingAndSortingRepository<Employee, Integer> {



}