package com.hstn.crud_empl.dao;

import com.hstn.crud_empl.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByLastNameAsc();
//    public List<Employee> findAllByOrderByLastNameDesc();
//    Это применяется в том случае, если нам нужно по убыванию
}
